# 第1章 データベースとSQL
記載するクエリは特段の記載がない限りMySQLとする。
<br>

## 1-4 テーブルの作成
### データベースの作成（CREATE DATABASE文）
例) ショップテーブルを作成する。
```sql
CREATE DATABASE shop;
```
<br>

### テーブルの作成（CREATE TABLE文）
例) 商品テーブルを作成する。
```sql
CREATE TABLE Product
(product_id         CHAR(4)         NOT NULL,
 product_name       VARCHAR(100)    NOT NULL,
 product_type       VARCHAR(32)     NOT NULL,
 product_sale_price INTEGER         DEFAULT 0,
 product_cost_price INTEGER         ,
 registration_date  DATA            ,
 PRIMARY KEY (product_id));
```
<br>

#### ※もしもテーブル名を間違えてしまったら・・・
例) 商品テーブルを「Priduct」と間違えたので「Product」に修正する
```sql
RENAME TABLE Priduct to Product;
```
<br>

## 1-5 テーブルの削除と変更
### テーブルの削除
例) 商品テーブルを削除する。
```sql
DROP TABLE Product;
```
<br>

### テーブル定義の変更
例) 商品テーブルに「商品名（カナ）」を追加する。
```sql
ALTER TABLE Product ADD COLUMN product_name_jp VARCHAR(100);
```
<br>

### テーブルの列を削除する
例) 商品テーブルの「商品名（カナ）」を削除する。
```sql
ALTER TABLE Product DROP COLUMN product_name_jp;
```
<br>

### テーブルへのデータ登録
例) 商品テーブルにデータを登録する。
```sql
-- DML:データ登録
START TRANSACTION;

INSERT INTO Product VALUE ('0001', 'Tシャツ', '衣服', 1000, 500, '2009-09-20');
INSERT INTO Product VALUE ('0002', '穴あけパンチ', '事務用品', 500, 320, '2009-09-11');
INSERT INTO Product VALUE ('0003', 'カッターシャツ', '衣服', 4000, 2800, NULL);
INSERT INTO Product VALUE ('0004', '包丁', 'キッチン用品', 3000, 2800, '2009-09-20');
INSERT INTO Product VALUE ('0005', '圧力鍋', 'キッチン用品', 6800, 5000, '2009-09-15');
INSERT INTO Product VALUE ('0006', 'フォーク', 'キッチン用品', 500, NULL, '2009-09-20');
INSERT INTO Product VALUE ('0007', 'おろしがね', 'キッチン用品', 880, 790, '2008-04-28');
INSERT INTO Product VALUE ('0008', 'ボールペン', '事務用品', 100, NULL, '2009-11-11');

COMMIT;
```