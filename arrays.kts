data class Student(val firstName: String, val grade: Int)

fun main() {
  //val things = arrayOf(1,2,3,"one","two","three")
  val things = arrayOf<Any>(1,2,3,"one","two","three")
  things[0] = "zero"
  for(thing in things) {
    println(thing)
  }
  
  //val students = arrayOf<Student>(Student(firstName: "Jim", grade: 6), Student(firstName: "Joe", grade: 5))
  val students = arrayOf<Student>(Student("Jim", 6), Student("Joe", 5))
  students[1] = Student("Daisy", 7)
  for(student in students){
    println(student)
  }
  
  //val fives = Array(size: 5, ::fiver)
  val fives = Array(5, ::fiver)
  fives.forEach {println(it)}
  
  println("fives has ${fives.size} elements")
  println("indices = ${fives.indices}")
  println("lastIndex = ${fives.lastIndex}")
  
  val pInts = intArrayOf(1,2,3)
  
}

fun fiver(index: Int): Int{
  return index * 5;
}

main()