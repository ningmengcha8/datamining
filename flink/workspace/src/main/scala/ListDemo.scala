/**
  * Created by Administrator on 2017/7/10.
  */
object ListDemo {
  def main(args: Array[String]) {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + "and" + threeFour + "is not mutated")
    println("Thus, "+ oneTwoThreeFour + "is a new List.")
  }
}
