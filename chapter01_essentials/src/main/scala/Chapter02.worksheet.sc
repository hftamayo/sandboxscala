/*
Chapter 2 exercises
2.4.5.1 Cat-o-matique
 */

object Oswald {
  val colour:String = "black"
  val food:String = "milk"
}

object Henderson {
  val colour:String = "Ginger"
  val food:String = "Chips"
}

object Quentin {
  val colour:String = "Tabby and White"
  val food:String = "Curry"
}

/*
2.4.5.2 Square Dance
 */

object calc {
  def square(x: Double) = x * x
  def cube(x: Double) = x * square(x)
}

/*
2.4.5.3 precise square dance
 */

object calc2 {
  def square(value: Double) = value * value
  def cube(value: Double) = value * square(value)

  //overloading de metodos
  def square(value: Int) = value * value
  def cube(value: Int) = value * square(value)
}