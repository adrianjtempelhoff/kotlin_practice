import java.util.Scanner

fun main() {
  //print("Enter text: ")
  println("Enter text: ")
  val txt = readLine() ?: ""
  //print("You entered: $txt, length = ${txt?.length}")
  println("You entered: $txt, length = ${txt.length}")
  
  //print("\nEnter an Integer value: ")
  println("\nEnter an Integer value: ")
  val string1 = readLine() ?: ""
  val iValue: Int = string1.toIntOrNull() ?: 0
  println("You entered: $iValue")
  
  //print("\nEnter an Double value: ")
  println("\nEnter an Double value: ")
  val string2 = readLine() ?: ""
  val dValue: Double = string2.toDoubleOrNull() ?: 0.0
  println("You entered: $dValue")
  
  scanner()
  
}

fun scanner() {
  println()
  val scan = Scanner(System.`in`)
  
  //print("Enter an integer number: ")
  println("Enter an integer number: ")
  val num1 = scan.nextInt()
  
  //print("Enter a double number: ")
  println("Enter a double number: ")
  //val num2 = scan.nextDouble() // throws a java.util.InputMismatchException
  val num2 = scan.next().toDoubleOrNull() ?: 0.0 
  
  println()
  println("First input number = $num1")
  println("Second input number = $num2")
}

main()