// Using a while loop, write a function displayContent() that takes a
// String parameter and displays each character on its own line.

fun main() {
    val list = mutableListOf<String>()
    while (true) {
        list.add("This is eating your 16GB RAM! " + list.size)
    }
}