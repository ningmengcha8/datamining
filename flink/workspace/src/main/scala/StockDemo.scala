import scala.util.Random

/**
  * Created by Administrator on 2017/7/11.
  */
import scala.util.Random
import scala.math.BigInt._
class StockDemo {
//  private[this] var price : Double = _
  private var price :Double = _
  def setPrice(p : Double){price = p}
  def isHigher(that : StockDemo) : Boolean = {this.price > that.price}
}
object StockDemo{
  def main(args: Array[String]) {
   val s1 = new StockDemo
   val s2 = new StockDemo
    s1.setPrice(90.4)
    s2.setPrice(89.4)
    println(s1.isHigher(s2))
    println("Hello" == "Hello")
    println(BigInt(2).pow(1024))
    println(probablePrime(3,Random))
    println(100.toString(36))
  }
}
