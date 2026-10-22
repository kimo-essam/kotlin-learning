fun calculateDiscount(price: Double, isGoldMember: Boolean): Int =
    if (isGoldMember) {
        if (price >= 100.00){
            20
        } else {
            10
        }
    } else {
        0
    }

fun main(){
    println(calculateDiscount(54.00, isGoldMember = false))     // 0
    println(calculateDiscount(109.3, true))       // 20
    println(calculateDiscount(100.00, false))     // 0
    println(calculateDiscount(54.00, true))     // 10
}