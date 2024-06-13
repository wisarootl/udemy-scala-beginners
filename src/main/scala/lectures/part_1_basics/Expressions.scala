package lectures.part_1_basics

object Expressions extends App {
  val x = 1 + 2 // 1 + 2 is Expression
  println(s"x: $x")

  println(s"2 + 3 * 4: ${2 + 3 * 4}")
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(s"1 == x: ${1 == x}")
  // == != > >= < <=

  println(s"!(1 == x): ${!(1 == x)}")
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(s"aVariable: $aVariable")

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(s"aConditionedValue: $aConditionedValue")
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  println("while loop")
  val aWhile = while (i < 5) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.
  // EVERYTHING in Scala is an Expression!
  val aWeirdValue = (aVariable = 3) // Unit === void in other language
  println(s"aWeirdValue: $aWeirdValue")

  // side effects: println(), whiles, reassigning

  // Code blocks is Expressions
  // The value of the block is the value of the last expression
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // Exercise
  // 1. difference between "hello world" vs println("hello world")?
  // "hello world" is value of type string
  // println("hello world") is expression of side effect (print "hello world" to the console). Its value is unit.

  // 2. the values of these values
  val someValue = {
    2 < 3
  } // true
  println(s"someValue: $someValue")

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  } // 42
  println(s"someOtherValue: $someOtherValue")
}
