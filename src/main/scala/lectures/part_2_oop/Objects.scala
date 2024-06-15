package lectures.part_2_oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    // instance - level functionality
  }
  // COMPANIONS : class and object are companions

  // Scala use object for class level definition
  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE if we do not implement class.
  println("\n=== SINGLETON INSTANCE ===")
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person(mary, john)

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
}
