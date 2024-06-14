package lectures.part_1_basics

object CallByNameAndCallByValue extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  // => indicate "call by name"
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime()) // pass the value `2977188864900L` (Long)
  // by value: 3084484775400
  // by value: 3084484775400
  calledByName(System.nanoTime()) // pass the expressions `System.nanoTime()` and calculate the expressions each time.
  // by name: 3084539863100
  // by name: 3084540547700

  def infinite(): Int = 1 + infinite() // this function will cause stack-overflow when execute.
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(34, infinite()) // this is not cause stack-overflow as infinite() is not execute.
}
