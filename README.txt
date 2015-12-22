README

以下の手順に従って、eclipseのプロジェクトを取り込んで実行してください。

１．yoshidki-rcwリポジトリをチェックアウトする
２．リポジトリ直下にある「ReadableCode」プロジェクトをeclipseにインポートする
３．mainを実行すると標準出力にレシピタイトルの「オムライス」が出力されます

eclipseを使用せずコマンドラインで実行する場合は以下のように実行してください。

１．yoshidki-rcwリポジトリをチェックアウトする
２．以下のコマンドを実行する
    （例）Windowsのコマンドプロンプトの場合
    cd ReadableCode
    mkdir classes
    cd src
    javac -d ..\classes -encoding UTF-8 com\justsystems\readable\yoshidki\*.java
    cd ..
    java -cp classes -Dfile.encoding=UTF-8 com.justsystems.readable.yoshidki.Main


レシピタイトルはプロジェクト直下の「recipe-data.txt」から読み取ります。
ファイルの文字コードは「UTF-8」です。
１行を１つのタイトルとして読み込みます。

