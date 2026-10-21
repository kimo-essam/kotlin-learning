/* Create a function checkSign() that checks whether an integer number is
positive, negative, or zero, and returns a String
"positive", "negative" or "zero" as a result. */

fun checkSign(num: Int): String {
    if (num == 0) {
        return "zero"
    }
    return if (num >0) {    // if statements ARE ALSO expressions. I am essentially
        "positive"          // saying that, IF THE NUMBER IS GREATER THAN 0 THEN POSITIVE WILL BE
    } else "negative"       // RETURNED, ELSE, THE NEGATIVE WILL BE RETURNED.
}

fun checkTemp(temp: Double): String =
    if (temp > 37.5)
        "High Temperature!"
    else if (temp < 32.5)
        "Low Temperature!"
    else "Normal Temperature!"


fun main(){
    println(checkSign(-5))
    println(checkSign(0))
    println(checkSign(4))
    println(checkTemp(12.5))
}