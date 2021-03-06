Deprecated
----------

**This project is deprecated.** If you want to manipulate collections, you should use Java 8 Stream API(or [Lightweight-Stream-API](https://github.com/aNNiMON/Lightweight-Stream-API)).

I changed this project as [Stream API Exercise](https://github.com/Nkzn/Java8StreamAPIExercise). Please use it.

RxJavaExercise
====================

RxJavaに慣れるための最初の一歩として行う訓練用プロジェクトです。コレクション操作を通じて、RxJavaの１つの側面を学んでいきます。

Usage
--------------------

### 動作環境

Gradleでライブラリ依存性の解決、ビルド、テストが行えるようになっています。

IntelliJ IDEAや、それに準ずるJava環境で扱われることを想定しています。

また、Java8環境のみで動作を確認しています。

### 進め方

2つのブランチから成り立っています。

* master: 設問
* resolution: 解答例

masterにはプロダクトコード(src/main)のスケルトンとテストコード(src/test)があります。このテストコードが全て通るように、プロダクトコードを実装してください。

masterから`my-challenge`などの自分用ブランチを切り出してから作業するのがオススメです。

### ヒント

各設問クラスの上部に、exampleやsampleといった名前のメソッドを用意してあります。これから使う機能が例示されているので、Javadocを含め、よく読んでから問題に取り組みましょう。

Inspired by
--------------------

* [JetBrains/workshop-jb](https://github.com/jetbrains/workshop-jb)
