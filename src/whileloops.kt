fun factorial(n: Int): Long {
    var sum = 1L
    for (i in n downTo 1){
        println(i)
        sum *= i
    }
    return sum
}

fun main(){
    println(factorial(10))
}