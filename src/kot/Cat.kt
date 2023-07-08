package kot

class Cat(val name: String, val age : Int, val weight: Float = 0f) {

    val siOld : Boolean
        get() = age >= 12
    fun printInfo(){
        print("Имя: $name" +
                " возраст: $age" +
                " вес: $weight")
    }
}