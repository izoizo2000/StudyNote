# 1. 情報セキュリティの基本概念
## 1.1 情報セキュリティのCIA
<dl>
<dt><font color="hotpink">機密性</font></dt>
<dd>許可されたものだけが情報にアクセスできる性質。</dd>
<br>
<dt><font color="hotpink">安全性</font></dt>
<dd>情報や情報の処理方法が正確で改ざんされていないこと表す性質。</dd>
<br>
<dt><font color="hotpink">可用性</font></dt>
<dd>許可されたものが必要な時に情報にアクセスできる性質。</dd>
<br>
</dl>

## 1.2 情報セキュリティの追加特性
<dl>
<dt>真正性</dt>
<dd>利用者の身元が主張通りであることを保証する性質。</dd>
<br>
<dt>責任追跡性</dt>
<dd>誰がいつ、どのような操作を行ったかを事後に追跡できる性質。</dd>
<br>
<dt>信頼性</dt>
<dd>業務や情報システムが正常に機能し、矛盾が生じたり異常な結果に終わることがない性質。</dd>
<br>
<dt>否認防止</dt>
<dd>取引の事実が、後になって当事者によって否認されることがない性質。</dd>
<br>
</dl>

## 1.3 脅威と脆弱性
<dl>
<dt>脅威</dt>
<dd>情報資産に損害を与える可能性がある潜在的な原因。</dd>
<br>
<dt>脆弱性</dt>
<dd>脅威がつけ込むことが出来る弱点。<br><font color="hotpink">セキュリティホール</font>と呼ばれることもある。</dd>
<br>
<dt><font color="hotpink">セキュリティインシデント</font></dt>
<dd>脅威によって実際に情報資産が損なわれてしまった「事態」。</dd>
<br>
<dt>リスク</dt>
<dd>脅威によって情報資産が損なわれる「可能性」。</dd>
<br>
</dl>

## 1.4 脅威の分類
<dl>
<dt><font color="hotpink">物理的脅威</font></dt>
<dd>事故や災害などにより、情報資産が物理的に破損したり、常務が妨害される脅威。</dd>
<br>
<dt><font color="hotpink">技術的脅威</font></dt>
<dd>情報システムやネットワークなどのIT環境で発生する脅威。</dd>
<br>
<dt><font color="hotpink">人的脅威</font></dt>
<dd>人が関わる脅威。</dd>
<br>
</dl>

## 1.5 情報資産
<font color="hotpink">情報資産</font>とは、情報セキュリティが守るべきすべての資産を意味する。<br>
ex）ハードウェア、ソフトウェア、データ、ネットワーク、記録媒体、人、技能・経験、組織の評判など。<br>
<br>

## 1.6 リスクと機会
<font color="hotpink">リスク</font>は、「情報資産に何らかの影響を与える可能性」を意味する言葉。<br>
<font color="hotpink">マイナスのリスク</font>は、ある事柄が起きると好ましくないリスク。<br>
<font color="hotpink">プラスのリスク</font>は、ある事柄が発生することが望まれるリスク。<br>
<br>

# 2. サイバー攻撃と情報セキュリティ
## 2.1 マルウェアの種類
<font color="hotpink">マルウェア</font>とは、悪意を持って作成された不正で有害な動作を行うプログラムの総称。<br>
マルウェアは<b>利用者や管理者の意図に反してコンピュータに入り込み</b>、データの破壊・改ざんや機密情報の流出など不正な行為を行う。<br>
<br>
<h3>マルウェアの種類</h3>
<dl>
<dt><font color="hotpink">コンピュータウイルス</font></dt>
<dd><b>他のファイルやプログラムに寄生</b>し、利用者に被害を与える不正プログラム。</dd>
<br>
<dt><font color="hotpink">ワーム</font></dt>
<dd>寄生することなく、単体での動作が可能な不正プログラム。<br>
<b>コンピュータ上で自分自身を複製(自己感染)し、増殖する</b>機能を持つ。</dd>
<br>
<dt><font color="hotpink">トロイの木馬</font></dt>
<dd>単体での動作が可能であり、ゲームやユーティリティなど<b>有用なプログラムを装って</b>実行されるのを待つ不正プログラム。</dd>
<br>
<dt><font color="hotpink">スパイウェア</font></dt>
<dd>利用者の行動履歴や個人情報を収集するプログラム。</dd>
<br>
<dt><font color="hotpink">キーロガー</font></dt>
<dd>コンピュータのキーボード操作を記録し、外部に送信するプログラム。</dd>
<br>
<dt><font color="hotpink">ボット</font></dt>
<dd><b>外部からコンピュータを不正に操作する</b>ことを目的としたプログラム。<br>
ボットに感染したコンピュータは、攻撃者の支持をネットワークを介して受取、指示通りの処理を実行する。<br>
ボットへ指令を出すサーバを<font color="hotpink">C&Cサーバ</font>という。また、ボットとC＆Cサーバの一団を<font color="hotpink">ボットネット</font>と呼ぶ。</dd>
<br>
<dt><font color="hotpink">ランサムウェア</font></dt>
<dd>ファイルの暗号化などによってコンピュータを使用できない状態にし、その解除と引き換えに金銭を要求するプログラム。</dd>
<br>
<dt><font color="hotpink">アドウェア</font></dt>
<dd>画面に広告などを強制的に表示するプログラム。</dd>
<br>
<dt><font color="hotpink">バックドア</font></dt>
<dd>不正な手順でコンピュータへアクセスすることを可能とする仕掛け。<br>
一度侵入に成功したシステムに対し、簡単に再侵入できるよう仕掛けられることがある。</dd>
<br>
<dt><font color="hotpink">ルートキット</font></dt>
<dd>感染しているマルウェアの活動状態や、侵入の痕跡などを隠ぺいする機能を持つ不正なプログラムを集めたパッケージ。</dd>
<br>
</dl>

## 2.2 コンピュータウイルスの機能
<dl>
<dt>自己伝染機能</dt>
<dd>他のプログラムに自らをコピーすることで、他のシステムに伝染する機能。</dd>
<br>
<dt>潜伏期間</dt>
<dd>発病する条件を満たすまで、症状を出さない機能。</dd>
<br>
<dt>発病機能</dt>
<dd>プログラムやデータなどの破壊など、利用者や管理者の意図しない動作をする機能。</dd>
<br>
</dl>
<b>コンピュータウイルス</b>は、<b>これらの機能の1つ以上を持つもの</b>と定められている。

## 2.3 コンピュータウイルスの種類
<dl>
<dt>ファイル感染型ウイルス</dt>
<dd>プログラムなど実行可能なじゃいるに感染するウイルス。<br>
感染したプログラムの実行に伴って起動し、不正な処理を実行する。</dd>
<br>
<dt>ブートセクタ型ウイルス</dt>
<dd>コンピュータの起動時に参照する特殊な領域(ブートセクタ)に感染するウイルス。<br>
コンピュータに起動時にウイルスが必ず読み込まれ、不正な処理を実行する。</dd>
<br>
<dt><font color="hotpink">マクロウイルス</font></dt>
<dd>ワープロや表計算といったアプリケーションのマクロ機能を利用し、データファイルに感染するウイルス。</dd>
<br>
</dl>

## 2.4 ウイルス対策ソフト
<font color="hotpink">ウイルス対策ソフト</font>とは、コンピュータウイルス対策を行うソフトウェアの総称で、コンピュータウイルスへの最も有効な対策。<br>
<br>

### ウイルス検出方法
<dl>
<dt><font color="hotpink">パターンマッチング</font></dt>
<dd>コンピュータウイルスが持つパターン(<font color="hotpink">シグネチャーコード</font>)を<font color="hotpink">パターンファイル</font>に格納し、検査対象のファイルと比較することで、コンピュータウイルスを検出する方式。<br>
この仕組み上、ウイルス定義ファイルに登録されていないコンピュータウイルスは検出できないため、<b>ウイルス定義ファイルを常に最新の状態にする</b>ことが重要。</dd>
<br>
<dt>インテグリティチェック法</dt>
<dd>ファイルにウイルスではないことを保証するデジタル署名などを付加する方法。</dd>
<br>
<dt>チェックサム法</dt>
<dd>ウイルスではないことを保証する情報に、データ検証用の値を用いる方法。</dd>
<br>
<dt>コンペア法</dt>
<dd>安全に保管されている原本と検査対象を比較する方法。</dd>
<br>
<dt><font color="hotpink">ビヘイビア法</font></dt>
<dd>ウイルスによって引き起こされる動作パターンを監視して検出する方法。</dd>
<br>
</dl>

## 2.5 マルウェア対策
<dl>
<dt><font color="hotpink">ホワイトリスト</font></dt>
<dd>インストールを許可するアプリケーションの一覧。<br>
これに該当しないものはインストールを許可しないようにする。</dd>
<br>
<dt><font color="hotpink">ブラックリスト</font></dt>
<dd>危険サイトの一覧。<br>
これに含まれるWebサイトへのアクセスを拒絶する。</dd>
<br>
</dl>
このようなWebサイトの制限を<font color="hotpink">Webフィルタリング</font>や<font color="hotpink">URLフィルタリング</font>と呼ぶ。<br>
<br>
<dl>
<dt>フォールスポジティブ</dt>
<dd>正当なWebサイトであるにもかかわらず、不正であると判断してしまう。</dd>
<br>
<dt>フォールスネガティブ</dt>
<dd>不正なWebサイトであるにもかかわらず、正当であると判断してしまう。</dd>
<br>
</dl>
OSやアプリケーションには、脆弱性が含まれていることがあり、これを放置しておくとウイルスに感染するリスクが高まる。<font color="hotpink">セキュリティパッチ</font>と呼ばれる修正用プログラムを適用し、OSやアプリケーションを常に最新の状態に保つことが重要。<br>
<br>

## 2.6 多層防御
コンピュータウイルスへの感染を防いだり、被害を軽減するためには<b>複数の対応を組み合わせて実施する</b>ことが有効。複数の対策を多層で行う防御策を<font color="hotpink">多層防御</font>という。<br>
<br>

## 2.7 コンピュータウイルス感染時の対応
コンピュータウイルスの感染が判明した場合には、各利用者は、むやみに不用意な対応をとってはならない。まず速やかにコンピュータをネットワークから切断し、早急にシステム管理者に連絡し、指示を仰ぐ。<br>
システム管理者は、ウイルスの駆除 > システムの回復 > 再発防止 > 公的機関へ連絡を行う。
<br>

## 2.8 不正アクセスによる攻撃とその対策
<font color="hotpink">不正アクセス</font>とは、正規のアクセス権を持たない者が、情報システムの内部へ侵入を行う行為。<br>
<br>
<h3>主な攻撃の種類</h3>
<dl>
<dt><font color="hotpink">盗聴</font></dt>
<dd>ネットワークを流れるデータや保存されているデータの不正入手。</dd>
<br>
<dt><font color="hotpink">改ざん</font></dt>
<dd>データの書き換え。</dd>
<br>
<dt><font color="hotpink">なりすまし</font></dt>
<dd>別の個人を装い、本人のふりをした様々な行為。</dd>
<br>
<dt>破壊</dt>
<dd>データやプログラムの削除、ハードディスクの初期化など。</dd>
<br>
<dt>コンピュータ不正使用</dt>
<dd>遠隔からのコンピュータの操作。</dd>
<br>
<dt>不正プログラムの埋め込み</dt>
<dd>ユーザの知らない間に情報を入手して外部へ送信したり、ファイルを破壊したりするなどの不正プログラムの埋め込み。</dd>
<br>
<dt><font color="hotpink">踏み台</font></dt>
<dd>不正アクセスを行う際の中継地点として他人のコンピュータを使用。<br>
踏み台に利用されたコンピュータは、所有者の意思に反し、本人の知らない間に攻撃に加担させられる。</dd>
<br>
</dl>

## 2.9 第三者中継
<font color="hotpink">第三者中継</font>とは、<b>メールサーバが外部の第三者からのメール送信依頼を受け付け、そのメールを配送すること</b>。第三者中継が許可されたメールサーバは、踏み台として利用され、スパムメールなどの迷惑メールの発信元になる恐れがある。<br>
<br>

## 2.10 アクセス権の管理
ある情報、資産に利用者がアクセスできる権限を<font color="hotpink">アクセス権</font>といい、アクセス権を正しく管理し、「正しい利用者が適切な情報のみにアクセスする」ようにすることを<font color="hotpink">アクセス制御</font>とよぶ。<br>
<br>

## 2.11 入退室管理
機密情報が格納されたサーバルームや、機密書類を保管する部屋は、<b>不用意に人の出入りを許してはならない</B>。<br>
入退室管理の基本は、<br>
- 入退室の許可を受けたものだけに制限する
- 入室後は許可を受けた行動のみに制限する

入退室を制限する仕組みとして、社員証などのICカードを用いた解錠が用いられている。<br>
ICカードによる認証に加えて、<b>暗証番号の入力を求めるなど複数の認証を組み合わせる</B>と効果的(<font color="hotpink">多要素認証</font>)。<br>
<b>入退室者の行動は監視</b>する<br>
<br>

## 2.12 クリアデスク、クリアスクリーン
<dl>
<dt>クリアデスク</dt>
<dd>・離席するときには、書類などをのぞき見されない、持ち出されないようにする。</dd>
<dd>・ノートPCは机に固定しておく。</dd>
<dd>・書類や外付けディスク、USBメモリなどは引き出しにしまう。</dd>
<br>
<dt>クリアスクリーン</dt>
<dd>・PCなどの情報機器から離れるときには、ディスプレイに情報が表示されないようにする。他人が操作できないようにする。</dd>
<dd>・システムからログオフする。</dd>
<dd>・パスワード付きのロック画面にする。</dd>
</dl>
<br>