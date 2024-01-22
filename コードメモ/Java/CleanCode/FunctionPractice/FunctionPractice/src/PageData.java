public class PageData {
    private String html;
    private WikiPage wikiPage;
    private String str = "";

    public String getHtml() {
        return html;
    }

    public WikiPage getWikiPage() {
        return wikiPage;
    }

    public boolean hasAttribute(String str) {
        return str == this.str;
    }

    public Object getContent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContent'");
    }

    public void setContent(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setContent'");
    }
}
