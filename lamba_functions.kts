fun main() {
  val lam: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
  println("Sum = ${lam(5, 10)}")
}

main()

