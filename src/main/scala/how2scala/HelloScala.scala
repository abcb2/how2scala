package how2scala

trait MyService {
  def findAll():String
}
trait MyServiceImpl extends MyService {
  def findAll():String = "MyServiceImpl#findAll"
}

class MySample {
  self: MyService =>
  val msg = "hello"
  def execute = {println(findAll())}
}


object HelloScala {
	def main(args: Array[String]){
    val obj = new MySample with MyServiceImpl
    obj.execute
	}
}