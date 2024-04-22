fun main() {
    val originalString = "Bu bir örnek cümledir."
    val subSequence1 = originalString.subSequence(3, 10)
    println("Alt dizi 1:$subSequence1")
    val subSequence2 = originalString.subSequence(7, originalString.length)
    println("Alt dizi 2: $subSequence2")
    val subSequence3 = originalString.subSequence(0, 5).reversed()
    println("Alt dizi 3: $subSequence3")
}