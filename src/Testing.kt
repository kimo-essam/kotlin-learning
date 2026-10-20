fun squareInt(i: Int): Int = i*2
fun tripleInt(i: Int): Int{
    return i*3
}
fun sumDoubles(n1: Double, n2: Double, n3: Double): Double = n1+n2+n3
fun duplicateText(text: String): String{
    return text+text
}

fun main() {
    println(squareInt(2))  // 4
    println(tripleInt(2))
    println(sumDoubles(4.0,54.9, 92.7))
    println(duplicateText("test"))
}