class Bosco () {
 
  init {
    increment()
  }
   
  companion object {    
    private var count = 0
    fun increment() {
      count++
    }
    fun show() {
      println("$count")
    }
  }
  
}

fun nop() {
  val b = Bosco()
}

fun main() {
  val b1 = Bosco()
  val b2 = Bosco()
  nop()
  val b3 = Bosco()
  Bosco.show()
}

main()