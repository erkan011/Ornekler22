fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    val isEventExists = numbers.any {it % 2 == 0}
    println("çift sayı var mı: $isEventExists")
    val isNegativeExists = numbers.any { it < 0 }
    println("negatif sayı var mı: $isNegativeExists")
}