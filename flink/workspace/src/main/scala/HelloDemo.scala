/**
  * Created by Administrator on 2017/7/11.
  */
object HelloDemo {
  def Hello(s : String) {
  var boeder = "-" * s.length + "--\n"
    println (boeder + "|" + s + "|\n" + boeder )

  }
  def countdown(n : Int){
    for(i <- 0 to n reverse ) println(i)
  }
  def signum(a : Int) : Int={
    if(a > 0) {
      1
    } else if(a == 0 ) 0
    else -1
  }
  def reverse(x : Int){
    for(i <- x.to(0,-1) )
     println(i)
  }
  def main(args: Array[String]) {
    Hello("Hello")
   println(signum(20))
//    for(i <- 0 to 10 reverse ) println(i)
   reverse(10)
    countdown(6)
  }

}
