fun getListOfNumbers(): List<Int>{
  var myList = mutableListOf<Int>()
  for(i in 1..7){
    println("Enter a number: ")
    val num = Integer.valueOf(readLine())
    myList.add(num)
  }
  return myList
}

fun findMax(list: List<Int>): Int{
  var largestNumber = list[0]
  for(i in list){
    if(i > largestNumber){
      largestNumber = i
    }
  }
  return largestNumber
}

fun findMin(list: List<Int>): Int{
  var smallestNumber = list[0]
  for(i in list){
    if(i < smallestNumber){
      smallestNumber = i
    }
  }
  return smallestNumber
}

fun findAverage(list: List<Int>): Int{
  var sum = 0
  for(i in list){
    sum+=i
  }
  return sum / list.size
}

fun checkIfListContains(list: List<Int>, num: Int): Boolean {
  var exists = false
  for(i in list){
    if(num == i){ 
      exists = true
      break       
    } 
  }
  return exists
}

fun main() {
  val values = getListOfNumbers()
  println(values)
  val largestValue = findMax(values)
  println("The largest number is $largestValue.")
  val smallestValue = findMin(values)
  println("The smallest number is $smallestValue.")
  val average = findAverage(values)
  println("The average is $average.")
  println("Enter a number to find in list: ")
  val numToFind = Integer.valueOf(readLine())
  val containsValue = checkIfListContains(values, numToFind)
  if(containsValue){println("Number exists in list")}
  else{println("Number does not exist in list")}
}


main()