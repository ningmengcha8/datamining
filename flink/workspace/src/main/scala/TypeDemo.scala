/**
  * Created by Administrator on 2017/7/11.
  */
import scala.math._
object TypeDemo {
  def main(args: Array[String]) {
    println(1.to(10))
    println("Hello".intersect("World"))
    val x : BigInt = 123456789
    println(x * x * x)
    println( sqrt(2),pow(3,5))
    println(min(3 , Pi))
    println("Hello".distinct)
    println("Hello".apply(4))
  }

}
