fun main() {
  val userName = "MyName"
  var magicNum: Int
  //magicNum = userName[0].toInt() * 5
  magicNum = userName.first().toInt() * 5
  magicNum += 3
  magicNum *= 2

  magicNum += 6
  magicNum -= 6

  println("$userName\'s age is $magicNum.")
}
