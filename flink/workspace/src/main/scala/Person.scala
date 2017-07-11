/**
  * Created by Administrator on 2017/7/11.
  */
class Person {
  private var _age = 2
  def age_=(num : Int) = this._age = num
  def age = _age
  def printObj{println(s"I can see ${Person.obj}")}

}
object  Person{
  def double(p: Person) = p._age * 2
  private val obj = "Person's object"
}
object Driver extends App{
  //伴生对象可以引用类的私有变量
  val p = new Person
  println(p.age)
  p.age = 10
  println(Person.double(p))
  //类可以引用伴生对象的私有变量
  p.printObj
}
