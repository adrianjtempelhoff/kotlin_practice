enum class Suit {
  Club, Diamond, Heart, Spade
}

fun main() {
  val x =1
  when(x) {
    1 -> println("x == 1")
    2 -> println("x == 2")
    3,4 -> println("x == 3 or 4")
  }

  val card = Suit.Spade
  //val y = when(card) { // a warning is thrown : never used
  when(card) {
    Suit.Club, Suit.Spade -> println("black card")
    Suit.Diamond, Suit.Heart -> println("red card")
  }
  

  val name = "Jim"
  val lastName = when(name) {
    "Hattan" -> "Hatoshi"
    "Smith" -> "Smithson"
    "Jim" -> "Jones"
    else -> {
      "unknown"
    }
  }  
  println("$name $lastName")

  val ageType = when (x) {
    in 0..1 -> "baby"
    in 2..4 -> "toddler"
    in 5..12 -> "kid"
    in 13..19 -> "teenager"
    in 20..64 -> "adult"
    else -> "Senior"
  }
  println("ageType is $ageType")
}

main()
