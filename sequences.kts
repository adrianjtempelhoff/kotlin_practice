/*val result = (100 until 200)
  .map { println("doubling $it"); it * 2 } ^map
  .filter { println("filtering $it"); it % 3 == 0 } ^filter
  .first()*/

/*val result = (100 until 200)
  .map { println("doubling $it"); it * 2 }
  .filter { println("filtering $it"); it % 3 == 0 }
  .first()*/

val result = (100 until 200).asSequence()
  .map { println("doubling $it"); it * 2 }
  .filter { println("filtering $it"); it % 3 == 0 }
  .first()


println("results = $result")
println()

println()
val myThrees = sequenceOf(1,3,5,7,9).filter { it % 3 == 0 }
println("myThrees = $myThrees")
println(myThrees.toList())

