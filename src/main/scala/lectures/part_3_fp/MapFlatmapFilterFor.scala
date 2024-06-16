package lectures.part_3_fp

object MapFlatmapFilterFor extends App {

  val list = List(1,2,3)
  println("== list ==")
  println(list)
  println(list.head)
  println(list.tail)


  // map
  println("\n== map ==")
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  // filter
  println("\n== filter ==")
  println(list.filter(_ % 2 == 0))

  // flatMap
  println("\n== flatMap ==")
  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))


  // print all combinations between two lists
  println("\n== combinations ==")
  val numbers = List(1,2,3,4)
  val chars = List('a','b','c','d')
  val colors = List("black", "white")

  val combinations1 = numbers.flatMap(n => chars.map(c => "" + c + n))
  println(combinations1)
  // "iterating"
  val combinations = numbers.filter(_ % 2 == 0).flatMap(n => chars.flatMap(char => colors.map(color => "" + char + n + "-" + color)))
  println(combinations)


  // foreach
  println("\n== foreach ==")
  list.foreach(println)

  // for-comprehensions
  println("\n== forCombinations ==")
  val forCombinations = for {
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color
  println(forCombinations)

  println("\n== for-loop ==")
  for {
    n <- numbers
  } println(n)


  // syntax overload
  println("\n== syntax overload ==")
  val doubled_list = list.map { x =>
    x * 2
  }
  println(doubled_list)

  /*
    1.  MyList supports for comprehensions?
        map(f: A => B) => MyList[B]
        filter(p: A => Boolean) => MyList[A]
        flatMap(f: A => MyList[B]) => MyList[B]
    2.  A small collection of at most ONE element - Maybe[+T]
        - map, flatMap, filter
   */
}
