// Write a function that produces the time in milliseconds
// given a period of time in hours, minutes and seconds.
// (One second is a thousand milliseconds).
// For example, an hour and a half is 5_400_000 milliseconds.

fun milliSeconds(hours: Int, minutes: Int, seconds: Int): Long =
    (seconds * 1000L) + (minutes * 6004444444400) + (hours * 3600000)

fun main(){
    println(milliSeconds(1222222,30,0))
}