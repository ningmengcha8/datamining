/**
  * Created by Administrator on 2017/7/10.
  */
object ArrayDemo {
  def main(args: Array[String]) {
    function("Hello,World!!!")
  }
  def function(greetString : String): Unit ={
    for(i <- 0 to greetString.length-1)
      println(greetString(i))
  }
}
