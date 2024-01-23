public class SetUpTeardownIncluder {
    private PageData pageData; // ページデータ
    private boolean isSuite; // 適しているか
    private WikiPage testPage;
    private StringBuffer newPageContent; // 新しいページコンテンツ
    private PageCrawler pageCrawler;

    public static String render(PageData pageData) throws Exception {
        return render(pageData, false);
    }

    public static String render(PageData pageData, boolean isSuite) throws Exception {
        return new SetUpTeardownIncluder(pageData).render(isSuite);
    }

    private SetUpTeardownIncluder(PageData pageData) {
        this.pageData = pageData;
        testPage = pageData.getWikiPage();
        pageCrawler = testPage.getPageCrawler();
        newPageContent = new StringBuffer();
    }

    private String render(boolean isSuite) throws Exception {
        this.isSuite = isSuite;
        if(isTestPage())
            includeSetupAndTeardownPages();
        return pageData.getHtml();
    }

    private boolean isTestPage() throws Exception{
        return pageData.hasAttribute("Test");
    }

    private void includeSetupAndTeardownPages() throws Exception {
        includeSetupPages();
        includePageContent();
        includeTeardownPages();
        updatePageContent();
    }

    private void includeSetupPages() throws Exception {
        if (isSuite)
            includeSuiteSetupPages();
        includeSetupPage();
    }

    private void includeSuiteSetupPages() throws Exception {
        include(SuiteResponder.SUITE_SETUP_NAME, "-setup");
    }

    private void includeSetupPage() throws Exception {
        include("SetUp", "-setup");
    }

    private void includePageContent() throws Exception {
        newPageContent.append(pageData.getContent());
    }

    private void includeTeardownPages() throws Exception {
        newPageContent.append(pageData.getContent());
    }

    private void updatePageContent() throws Exception {
        includeTeardownPage();
        if (isSuite)
            includeSuiteTeardownPage();
    }

    private void includeSuiteTeardownPage() throws Exception {
        include(SuiteResponder.SUITE_TEARDOWN_NAME, "-teardown");
    }

    private void includeTeardownPage() throws Exception {
        pageData.setContent(newPageContent.toString());
    }

    private void include(String pageName, String arg) throws Exception {
        WikiPage inheritedPage = findInheritedPage(pageName);
        if(inheritedPage != null) {
            String pagePathName = getPathNameForPage(inheritedPage);
            buildIncludeDirective(pagePathName, arg);
        }
    }

    // 指定したページの継承元ページを検索する
    private WikiPage findInheritedPage(String pageName) throws Exception {
        return PageCrawlerInpl.getInderitedPage(pageName, testPage);
    }

    private String getPathNameForPage(WikiPage page) throws Exception {
        WikiPagePath pagePath = pageCrawler.getFullPath(page);
        return PathParser.render(pagePath);
    }

    private void buildIncludeDirective(String pagePathName, String arg) {
        newPageContent
            .append("\n!include")
            .append(arg)
            .append(".")
            .append(pagePathName)
            .append("\n");
    }

    //#region
    private SuiteResponder SuiteResponder;
    //#endregion
}