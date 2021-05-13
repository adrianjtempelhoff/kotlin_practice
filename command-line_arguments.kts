fun main(args: Array<String>) {
  println("$args")
  
  for (arg in args) {
    println("arg is ${arg}")
  }
}
main(arrayOf("one","two","three"))
