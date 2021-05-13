fun main() {
  var cardPoints = 7_000
  
  println("... using if ...")
  
  val cardLevel1: String = if (cardPoints >= 0 && cardPoints < 1000) {
    "pearl"
  } else if (cardPoints >= 1000 && cardPoints < 5_000) {
    "silver"
  } else if (cardPoints >= 5_000 && cardPoints < 10_000) {
    "gold"
  } else {
    "platinum"
  }
  
  val plural1 = if (cardPoints > 1 || cardPoints == 0) "s" else ""
  println("You have $cardPoints point$plural1 and are at the $cardLevel1 level.")
  
  println("... using when ...")
  
  val cardLevel2: String = when (cardPoints) {
    in 0..999 -> "pearl"
    in 1_000..4_999 -> "silver"
    in 5_000..9_999 -> "gold"
    else -> "platinum"
  }
  
  val plural2 = if (cardPoints > 1 || cardPoints == 0) "s" else ""
  println("You have $cardPoints point$plural2 and are at the $cardLevel2 level.")
  
}  

main()