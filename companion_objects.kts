class CantCreate private constructor(val message: String) {
  fun showMessage() {
    println(message)
  }

  companion object {
    const val Light_Speed = 299_792_458
    fun factory(msg: String): CantCreate {
      return CantCreate(msg)
    }
    fun sillyPrint(self: CantCreate) {
      println("Accessing ${self.message}")
    }
  }
}

fun main() {
  // val c1 = CantCreate("hello")
  val c2 = CantCreate.factory("hello")
  c2.showMessage()
  CantCreate.sillyPrint(c2)
  println("light speed : ${CantCreate.Light_Speed} ms/s")
}

main()

