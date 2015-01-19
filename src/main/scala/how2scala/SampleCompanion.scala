package how2scala

class SampleCompanion private(num:Int)

object SampleCompanion {
  def apply(num:Int) = {
    new SampleCompanion(num)
  }
}

object Main {
  def main(args:Array[String]) = {
    val ins = SampleCompanion(10)
    println(ins)
  }
}