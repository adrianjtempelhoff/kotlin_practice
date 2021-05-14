fun main () {
  println(greeter("Jim"))
  println()
  println(greetme("Jimbo"))
  println()
  println(volume(2,3))
  println()
  println(volumeX(width = 4, height = 2))
}

fun greeter (name: String): String {
  return "Hello, $name"
}

fun greetme (name: String) = "Hi there, $name"

fun volume(length: Int, width: Int, height: Int = 10) = length * width * height

fun volumeX(length: Int = 10, width: Int, height: Int) = length * width * height

main()