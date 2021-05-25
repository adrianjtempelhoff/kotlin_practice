fun main() {
  
  var responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")

  var responsibilitiesComplete = 0
  var timeSpent = 0
  var totalShiftTime = 4

  var foxiesHealthCheck = mutableMapOf<Any?, Any?>()

  var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

  println("First, ${responsibilities[0]}")

  for (chimp in  chimpsHaveEaten.keys){
    println("Feedin $chimp....")
    chimpsHaveEaten[chimp] = true
  }
  responsibilitiesComplete++
  timeSpent++

  println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

  println("Next, ${responsibilities[1]}.")

  var games = setOf("tug-of-war with a blanket", "catch and throw", "number game")

  var randomGame = games.random()
  println(randomGame)

  responsibilitiesComplete++
  timeSpent++

  println("Each chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

  println("Next, ${responsibilities[2]}.")

  foxiesHealthCheck.put("temperature", 32.7)
  foxiesHealthCheck.put("mood", "happy")

  println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}.")

  responsibilitiesComplete++
  timeSpent++
  
  println("You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

  if(timeSpent <= totalShiftTime) {
    if(responsibilitiesComplete == responsibilities.size) {
      println("Congratulations, all tasks complete.")
    }
    else {
        println("Tasks incomplete.")
      }
  } else if (timeSpent >= totalShiftTime) {
      if(responsibilitiesComplete == responsibilities.size) {
        println("Tasks complete, but overtime.")
      }
      else {
        println("Tasks incomplete.")
      }
  } else {
    println("Tasks incomplete.")
  }
}

main()