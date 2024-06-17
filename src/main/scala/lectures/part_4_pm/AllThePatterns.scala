package lectures.part_4_pm

import exercises._

object AllThePatterns extends App {


  // 1 - constants
  val x: Any = "Scala"
  val constants = x match {
    case 1 => "a number"
    case "Scala" => "THE Scala"
    case true => "The Truth"
    case AllThePatterns => "A singleton object"
  }

  // 2 - match anything
  // 2.1 wildcard
  val matchAnything = x match {
    case _ =>
  }

  // 2.2 variable
  val matchAVariable = x match {
    case something => s"I've found $something"
  }

  // 3 - tuples
  println("\n== tuple ==")
  val aTuple = (1,2)
  val matchATuple = aTuple match {
    case (1, 1) =>
    case (something, 2) => s"I've found $something"
  }
  println(matchATuple)

  val nestedTuple = (1, (2, 3))
  val matchANestedTuple = nestedTuple match {
    case (_, (2, v)) => v
  }
  println(matchANestedTuple)
  // PMs can be NESTED!

  // 4 - case classes - constructor pattern
  // PMs can be nested with CCs as well
  val aList: MyList[Int] = Cons(1, Cons(2, Empty))
  val matchAList = aList match {
    case Empty =>
    case Cons(head, Cons(subhead, subtail)) =>
  }

  // 5 - list patterns
  println("\n== list patterns ==")
  val aStandardList = List(1,2,3,42)
  val standardListMatching = aStandardList match {
    case List(1, _, _, _) => 1 // extractor - advanced
    case List(1, _*) => 2 // list of arbitrary length - advanced
    case 1 :: List(_) => 3 // infix pattern
    case List(1,2,_) :+ 42 => "lala"// infix pattern
  }
  println(standardListMatching)

  // 6 - type specifiers
  val unknown: Any = 2
  val unknownMatch = unknown match {
    case list: List[Int] => // explicit type specifier
    case _ =>
  }

  // 7 - name binding
  println("\n== name binding ==")
  val nameBindingMatch = aList match {
    case nonEmptyList @ Cons(_, _) => s"1. the name is $nonEmptyList" // name binding => use the name later(here)
    case Cons(1, rest @ Cons(2, _)) =>  s"2. the name is $rest" // name binding inside nested patterns
  }
  println(nameBindingMatch)

  // 8 - multi-patterns
  println("\n== multi-patterns ==")
  val multipattern = aList match {
    case Empty | Cons(1, _) => 1 // compound pattern (multi-pattern)
    case _ =>
  }
  println(multipattern)


  // 9 - if guards
  println("\n== if guards ==")
  val secondElementSpecial = aList match {
    case Cons(_, Cons(specialElement, _)) if specialElement % 2 == 0 => "match with if guards"
  }
  println(secondElementSpecial)

  //  val anything: Any = ???
  println("\n== val anything ==")
  val anything: Any = new NullPointerException("test")
  val matchAnything2 = anything match {
    case _: RuntimeException | _:NullPointerException => "test1"
    case _ => 2
  }
  println(matchAnything2)

  // ALL.

  /*
    Question.
   */

  println("\n== Question ==")
  val numbers = List(1,2,3)
  val numbersMatch = numbers match {
    case listOfStrings: List[String] => "a list of strings"
    case listOfNumbers: List[Int] => "a list of numbers"
    case _ => ""
  }

  println(numbersMatch)
  // JVM trick question
}
