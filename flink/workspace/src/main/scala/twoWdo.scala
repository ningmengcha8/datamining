/**
  * Created by Administrator on 2017/7/11.
  */
object twoWdo {
  def main(args : Array[String]) {
//    val str = "Hello"
//    var result : Long = 1
//    for (i <- str) {
//      result *= i.toLong
//    }
//    println(result)
//      var t : Long = 1
       val str = "Hello"
       var result : Long = 1
       result = mult(str)
       println(result)
       println(product(str))
      println(mi(2,-5))
     //    "Hello".foreach(t *=_.toLong )
    //    println(t)
  }
  def mult(s : String): Long={
    s.map(_.toLong).product
  }
    def product(s : String) : Long = {
      if (s.length == 1) {
        s(0).toLong
      } else {
        s(0).toLong * product(s.substring(1));
      }
    }
   def mi(x:Double,n:Int):Double={
    if(n == 0) 1
    else if (n > 0 && n%2 == 0) mi(x,n/2) * mi(x,n/2)
    else if(n>0 && n%2 == 1) x * mi(x,n-1)
    else 1/mi(x,-n)
  }

}
