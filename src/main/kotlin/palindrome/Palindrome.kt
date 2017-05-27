package palindrome

fun isPalindrome(s: String): Boolean {
    return s.contentEquals(s.reversed())
}