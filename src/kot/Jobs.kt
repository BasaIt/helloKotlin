package kot

import java.time.LocalDate
import java.time.Year
import java.util.Calendar

class Jobs(val name: String, val magory : String, val stage : Int = 2021) {
    val exception
        get() = Calendar.getInstance().get(Calendar.YEAR) - stage
    fun jobs(){
        println("Работаю")
    }
}