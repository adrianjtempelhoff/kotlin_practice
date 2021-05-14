import java.io.File

fun main() {
  
  val res = "./files"
  val sales = "sales.txt"
  val pFile = File("${res}/$sales")
  
  val items = mutableListOf<Double>()

  pFile.forEachLine { 
    //println(it) 
    val dVal = it.toDoubleOrNull()
    if (dVal != null) {
      items.add(dVal)    
    }
  }
  items.forEach { println(it) }
  
}

main()
