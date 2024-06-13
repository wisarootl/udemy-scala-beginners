package lectures.part_1_basics

object ValueVariableTypes extends App {
  // Values (`val`) are immutable
  // COMPILER can infer type.
  val x: Int = 42
  println(x)

  val aString: String = "hello"
  val anotherString: String = "goodbye"

  val aBoolean: Boolean = false
  // " for String and ' for Char
  val aChar: Char = 'a'
  val anInt: Int = x // 32 bit
  val aShort: Short = 12346 // 16 bit
  val aLong: Long = 15456456 // 64 bit
  val aFloat: Float = 2.0f // 32 bit
  val aDouble: Double = 3.14 // 64 bit

  // Variables (`var`) is mutable
  var aVariable: Int = 4
  aVariable = 5 // variable can be reassigned

  // prefer vals over vars
  // all vals and vars have types
  // compiler can automatically infers types when omitted

}

