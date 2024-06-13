package lectures.part_1_basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println("aFunction")
  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println()
  println("aParameterlessFunction")
  println(aParameterlessFunction())
  // println(aParameterlessFunction) // only works in Scala 2 - parameterless functions are invoked without parentheses

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println()
  println("aRepeatedFunction")
  println(aRepeatedFunction("hello",3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    Exercises:
    1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2.  Factorial function 1 * 2 * 3 * .. * n
    3.  A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    4.  Tests if a number is prime.
   */

  def greetingForKids(name: String, age: Int): String = {
    // "Hi, my name is " + name + " and I am " + age + " years old."
    s"Hi, my name is $name and I am $age years old"
  }
  println()
  println("greetingForKids")
  println(greetingForKids("David", 12))

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)
  println()
  println("factorial")
  println(factorial(5))

  def fibonacci(n: Int): Int = {
    var a = 0
    var b = 1

    if (n <= 1) return n

    for (i <- 2 to n) {
      val c = a + b
      a = b
      b = c
    }
    return b
  }

  println()
  println("fibonacci")
  println(fibonacci(2)) // should be 1
  println(fibonacci(6)) // should be 8

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println()
  println("isPrime")
  println(isPrime(37)) // true
  println(isPrime(2003)) // true
  println(isPrime(37 * 17)) // false
}
