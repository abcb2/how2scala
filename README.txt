■sbtでscalaプロジェクトを管理してEclipseで開発する方法

- scala-ideをeclipseにインストール
http://scala-ide.org/

- 下記の用な構成で
$ tree .
.
├── build.sbt
└── project
    └── plugins.sbt

- plugins.sbtにeclipseの設定を入れる
$ cat project/plugins.sbt 
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

- 下記コマンドを実行してeclipse用のファイルを生成
$ sbt eclipse

- eclipseにExistingProjectとしてImportする。
 
