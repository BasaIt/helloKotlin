package kot

class Programmer(name: String, age: Int, val major: String) : Work(name, age), Cleaner {
    override fun work() {
        println("Пишу код на $major")
    }

    override fun clean() {
        println("Программист убирается")
    }


}