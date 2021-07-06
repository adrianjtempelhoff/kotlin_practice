fun countDown(secondsToMidnight: Int){
  if(secondsToMidnight == 0) {
    println("Happy New Year!")
  } else {
    println(secondsToMidnight)
    countDown(secondsToMidnight - 1)
  }
}

/* Tail-Recursive Functions
 Kotlin solution : tail-recursive functions
 When using a tail-recursive function, the compiler can optimize the code to prevent stack overflow.
 To declare a tail recursive function, prepend tailrec to the fun keyword in the header
*/
tailrec fun factorial(num: Int, product: Int = 1): Int {
  return if(num == 1) product 
  else factorial(num - 1, num * product)
  
}


fun main() {
  countDown(10)
  val factorialValue = factorial(10)
  println(factorialValue)
}

main()