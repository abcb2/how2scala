package how2scala

object Concurrent01 {
	def main(args:Array[String]){
		println("ThreadSample#main start")
		for(i <- 0 to 3){
			val t = new Thread(new ThreadSample("[Thread-" + i + "]"))
			t.start()
		}
		println("ThreadSample#main finish")
	}
}

class ThreadSample(name:String) extends Runnable {
	def run() = {
		for(i <- 0 to 3){
			println(name + "count=" + i)
			Thread.sleep(100)
		}
	}
}