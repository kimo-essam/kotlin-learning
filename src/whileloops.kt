fun factorial(n: Int): Long {
    var sum = 1L
    for (i in n downTo 1){
        sum *= i
    }
    return sum
}

fun sumOfFactorial(n: Int): Long {
    var total = 0L
    for (i in n downTo 1){
        total += factorial(i)
    }
    return total
}

fun main(){
    println(sumOfFactorial(15))
}