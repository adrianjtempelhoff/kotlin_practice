data class Person(var firstName: String, var lastName: String)

fun main() {
  // val person1: Person = null
  val person2: Person? = null

  val greeting: String? = "Hello there"
  if (greeting != null) {
    println("Jim says: $greeting")
  }

  println("greeting length = ${greeting?.length}")

  val len = greeting?.length ?: 0
  println("length = $len")

  val badLen = greeting!!.length

  val safeGreeting: String? = greeting as? String

}

main()
