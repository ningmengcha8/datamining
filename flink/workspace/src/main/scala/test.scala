/**
  * Created by Administrator on 2017/7/11.
  */
import scala.math._
object test {
  def distance(x: Int, x0: Int, y: Int, y0: Int): Double = {
    val dis = {
      val dx = x - x0;
      val dy = y - y0;
      sqrt(dx * dx + dy * dy)
    }
    dis
  }
  def fac(n : Int) = {
    var r = 1
    for(i <- 1 to n) r = r * i
    r
  }
  def fac1( a : Int) : Int = if(a <= 0) 0 else a * fac(a-1)

  def main(args: Array[String]) {
    println("a坐标与b坐标之间的距离是：" + distance(3, 2, 4, 1))
//    val name = readLine("Your name :")
//    println("Your name :" + name)
//    val age =  readLine("Your age :")
//    println("Your age :" +  age)
    for(i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i +j) + " ")
    println()
    println(for(i <- 1 to 10) yield i % 3)
    println(fac(5))
    println(fac1(5))
  }
}
