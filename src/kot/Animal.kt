package kot

import java.util.Scanner

open class Animal (val name : String, var weight: Float, val habitate : String ){
    open fun eat(){
         println("Кушаю еду")
    }
    fun run(){
         println("Бегу")
    }

}