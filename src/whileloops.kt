// Using a while loop, write a function displayContent() that takes a
// String parameter and displays each character on its own line.

fun displayContent(text: String){
    var index = 0
    while (index < text.length){
        println(text[index])
        index++
    }
}

fun main(){
    displayContent("Denominator32")
}