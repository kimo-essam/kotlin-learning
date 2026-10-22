fun triagePatient(isBreathing: Boolean, hasPulse: Boolean): String =
    if (isBreathing) {
        if (hasPulse) {
            "Stable"
        } else {
            "Respiratory Arrest Emergency"
        }
    } else {
        if (hasPulse) {
            "Oxygen Needed Immediately"
        } else {
            "Execute CPR / Code Blue!"
        }
    }

fun main(){
    println(triagePatient(isBreathing = true, hasPulse = true))
    println(triagePatient(isBreathing = true, hasPulse = false))
    println(triagePatient(false, hasPulse = true))
    println(triagePatient(isBreathing = false, hasPulse = false))
}