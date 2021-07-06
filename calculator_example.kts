// Write your code here 
class Calculator(val name: String){
  init{
    println(name)
  }
  fun add(num1: Int, num2: Int): Int {
    return num1+num2
  }
  fun subtract(num1: Int, num2: Int): Int {
    return num1-num2
  }
  fun multiply(num1: Int, num2: Int): Int {
    return num1*num2
  }
  fun divide(num1: Int, num2: Int): Any {
    if(num1 == 0 || num2 == 0)
    {       
       return "Error can't devide by 0"
    }
    else{
      return num1/num2
    }
  }
  fun power(num1: Int, num2: Int): Int {
    //return Math.pow(num1,num2)
    var result = 1
    for(i in 1..num1){
      result=result * num2
    }
    return result
  }
}

fun main(){
  val calc1 = Calculator("Codey")
  println(calc1.add(1, 4))
  println(calc1.subtract(3, 2))
  println(calc1.multiply(2, 4))
  println(calc1.divide(8, 2))
  println(calc1.divide(8, 0))
  println(calc1.power(3, 3))
}
main()