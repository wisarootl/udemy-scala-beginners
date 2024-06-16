package lectures.part_2_oop

object CaseClasses extends App {

      /*
        equals, hashCode, toString
       */

      case class Person(name: String, age: Int)

      // 1. class parameters are fields
      val jim = new Person("Jim", 34)


      // 2. sensible toString
      // println(instance) = println(instance.toString) // syntactic sugar
      println("== 2. toString ==")
      println(jim.toString)
      println(jim)
      // toString is `Person(Jim,34)`
      // toString will be `lectures.part_2_oop.CaseClasses$Person@3498ed` without case class

      // 3. equals and hashCode implemented OOTB (out of the box)
      val jim2 = new Person("Jim", 34)
      println("== 3. equals and hashCode ==")
      println(jim == jim2)


      // 4. CCs have handy copy method
      println("== 4. copy ==")
      val jim3 = jim.copy(age = 45)
      println(jim3)

      // 5. CCs have companion objects
      val thePerson = Person
      val mary = Person("Mary", 23)

      // 6. CCs are serializable
      // Akka

      // 7. CCs have extractor patterns = CCs can be used in PATTERN MATCHING

      // case object
      case object UnitedKingdom {
            def name: String = "The UK of GB and NI"
      }

      /*
        Expand MyList - use case classes and case objects
       */
}
