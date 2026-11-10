// Write a function that checks whether its String parameter is a valid identifier.
// A valid identifier is a non-empty String
// that starts with a letter or underscore and consists of only letters, digits and underscores.
// Use s.isEmpty() to check whether s is an empty String

fun isValidFirstChar(char: Char) : Boolean =
    (
            char == '_' ||
            char in 'a'..'z' ||
            char in 'A'..'Z'
    )

fun isValidChar(char: Char) : Boolean =
    (
            char in 'a'..'z' &&
            char in 'A'..'Z' &&
            char in '0'..'9' &&
            char != '_'
    )
fun isValidString(text: String) : Boolean {
    if (text.isEmpty()) {
        return false
    }
    if (isValidFirstChar(text[0])) {
        for (c in text) {
            if (isValidChar(c)) {
                return false
            }
        }
        return true
    }
    return false
}

fun main(){
    println(isValidString(".teng"))
    println(isValidString("Tung"))
    println(isValidString("4teng"))
    println(isValidString(""))
    println(isValidString(" "))
    println(isValidString(".teng"))
    println(isValidString("_______"))
    println(isValidString("_teng"))
    println(isValidString("444444"))
}