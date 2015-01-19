package how2scala

class Apple
object Apple {
  def unapply(a: Any):Boolean = {
    if(a.isInstanceOf[Apple]) true else false
  }
}

class Orange(val name:String)
object Orange {
  def apply(name: String):Orange = new Orange(name)
  def unapply(a: Orange):Option[String] = Some(a.name)
}

object Hoge {
  def main(args: Array[String]){
    matchTest(Orange("DEKOPONN"))
  }
  def matchTest(value:Any) = {
    value match {
      case Apple => println("Apple")
      case Orange(name) => println("ORANGE->" + name)
      case _ => println("OTHER")
    }
  }
}