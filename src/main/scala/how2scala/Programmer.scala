package how2scala

class Programmer(_language: String) {
  println("Programmer インスタンスの作成")
  println("language " + _language)
  require(_language != null)
  val language = _language;
  
  def this() = this("Scala")
  def coding() = println(language + " を使ってコーディング")
}