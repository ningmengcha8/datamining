/**
  * Created by Administrator on 2017/7/11.
  */
import scala.collection.mutable.Map
class ChecksumAccmulator {
  private var sum = 0
  def add(b : Byte){
    sum += b
  }
  def checksum() : Int = ~(sum & 0xFF) + 1
}
object ChecksumAccmulator {
  private val cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccmulator
      for (c <- s) acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}
  object Summer{
    def main(args: Array[String]) {
      println(ChecksumAccmulator.calculate("Every value is an object."))
    }
  }

