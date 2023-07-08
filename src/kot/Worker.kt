package kot

import java.util.Calendar

class Worker(val name: String, val worker: String, val stage : Int ){
    val isStage: Int
        get() {
            val year = Calendar.getInstance().get(Calendar.YEAR) - stage
            return year
        }
    fun work(){
        println("Работаю")
    }
}