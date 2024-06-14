package lectures.part_1_basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(s"str.charAt(2) : ${str.charAt(2)}")
  println(s"str.substring(7, 11) : ${str.substring(7, 11)}")
  println(s"str.split(\" \").toList : ${str.split(" ").toList}")
  println(s"str.startsWith(\"Hello\")t : ${str.startsWith("Hello")}")
  println(s"str.replace(\" \", \"-\") : ${str.replace(" ", "-")}")
  println(s"str.toLowerCase() : ${str.toLowerCase()}")
  println(s"str.length : ${str.length}")


  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z') // prepending +: and appending +:

  println(s"str.reverse : ${str.reverse}")
  println(s"str.take(2) : ${str.take(2)}")

  // Scala-specific: String interpolators.

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(anotherGreeting)

  // F-interpolators (format)
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline $str")
  val escaped = "This is a \n newline $str"
  println(raw"$escaped")
}
