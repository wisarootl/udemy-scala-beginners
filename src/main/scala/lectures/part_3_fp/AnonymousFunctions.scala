package lectures.part_3_fp

object AnonymousFunctions extends App {

  // anonymous OOP
  //  val doubler = new Function[Int, Int] {
  //    override def apply(x:Int) = x * 2
  //  }

  // anonymous function FP (LAMBDA)
  val doubler: Int => Int = (x: Int) => x * 2
  println("\ndoubler")
  println(doubler(2))

  // multiple params in a lambda
  println("\nadder")
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // no params
  println("\njustDoSomething")
  val justDoSomething: () => Int = () => 3

  // careful
  println(justDoSomething) // function itself
  println(justDoSomething()) // call

  // curly braces with lambdas
  println("\nstringToInt")
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  println("\nMOAR syntactic sugar")
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a,b) => a + b

  /*
    1.  MyList: replace all FunctionX calls with lambdas
    2.  Rewrite the "special" adder as an anonymous function
   */


  println("\nsuperAdd")
  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
}
