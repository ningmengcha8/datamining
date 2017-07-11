/**
  * Created by Administrator on 2017/7/10.
  */
object SetDemo {
  def main(args: Array[String]) {
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Boeing"))
  }
}
