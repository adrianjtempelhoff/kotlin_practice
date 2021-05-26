fun main() {
  // Square Variables
  val sqSide = 7
  val sqChar1 = "X  "
  val sqChar2 = "O  "
  for(i in 1..sqSide){    
    for(j in 1..sqSide){      
      if(((i % 2 == 0) && (j % 2 == 0)) || ((i % 2 != 0) && (j % 2 != 0))) {
        print(sqChar1)
      } else {
        print(sqChar2)
      }
    }
    println()
  }
  

  // Triangle Variables
  val triRows = 10
  var triCount = 0
  var triRowLen = triRows
  val triChar1 = "/  "
  val triChar2 = "   "
  for(i in triRows downTo 1){
    while(triCount < triRowLen){      
      triCount++
      print(triChar1)
    }
    triCount=0
    triRowLen--
    println()
  }

  println()

  // 2nd Triangle Variables
  triCount = 0
  triRowLen = triRows  
  for(i in triRows downTo 1){
    while(triCount < triRowLen){      
      triCount++
      if(triCount != 1 && triCount != triRowLen && i != triRows){
        print(triChar2)
      } else {
        print(triChar1)
      }
      
    }
    triCount=0
    triRowLen--
    println()
  }


}

main()