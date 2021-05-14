fun replicate(func: (Int, String) -> Unit) {
  func(5, "Be Cool.")
}

fun main() {
  replicate { count, msg ->
    for (ndx in 1..count) {
      println(msg)
    }
  }
}

main()