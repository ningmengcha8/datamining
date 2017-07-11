/**
  * Created by Administrator on 2017/7/11.
  */
class Worker private{
  def work() = println("I am the only worker!")
}

object Worker{
  val worker = new Worker
  def GetWorkInstance() : Worker = {
    worker.work()
    worker
  }
}

object Job{
  def main(args: Array[String]) {
    for (i <- 1 to 5) {
      Worker.GetWorkInstance();
    }
  }
}
