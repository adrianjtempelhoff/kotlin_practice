fun main() {
  val words = listOf("racecar", "civic", "level", "butter")
  for (word in words) {
    println("Palindrome $word? ${isPalindrome(word)}")
  }
}

fun isPalindrome(word: String): Boolean {
  fun doCharsMatch(front: Int, back: Int): Boolean {
    if (front >= back) return true
    //if (word[front].toUpperCase() != word[back].toUpperCase()) return false
    if (word[front].uppercaseChar() != word[back].uppercaseChar()) return false
    return doCharsMatch(front + 1, back - 1)
  }
  if (word.length < 2) return true
  return doCharsMatch(0, word.lastIndex)
}

main()
