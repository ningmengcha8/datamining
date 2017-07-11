import java.text.MessageFormat

/**
  * Created by Administrator on 2017/7/11.
  */
object argumentsDemo {
  def sum(args : Int*) = {
    var result = 0
    for (arg <- args )
      result += arg
    result
  }
  def sum1(a : Int*) : Int= {
    if(a.length == 0) 0
    else a.head +sum1(a.tail: _*)
  }

  def main(args: Array[String]) {
    println(sum(3,4,5,6,7,8,9,0,1,2))
    println(sum(1 to 9 : _*))
    println(sum1(1,2,3,4,5,6,7,8,9,10))
    val str = MessageFormat.format("The answer to {0} is {1}", "everything", 42.asInstanceOf[AnyRef])
    println(str)
  }

}
