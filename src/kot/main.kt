

package kot
import kot.Month.*
import kot.Season.*
import java.util.*

val str:String? = null
var num: MutableList<Int>? = mutableListOf<Int>()


fun main(args: Array<String>) {
    val worker = mutableListOf<Work>()
    worker.add(Work("Артем", 25))
    worker.add(Work("Василий", 26))
    worker.add(Work("Инакентий", 55))
    worker.add(Work("Жорж", 30))
    worker.add(Programmer("Жорж", 30, "Kotlin"))
    worker.add(Programmer("Артур", 27, "Kotlin Android Developer"))
    worker.add(Programmer("Сергей", 19, "java"))
    val cleaners = worker.filter { it is Cleaner }.map { it as Cleaner }
    for (clean in cleaners){
        clean.clean()
    }
}





fun Int.isComper():Boolean{
    if (this <= 3) return  true
    for(i in 2 until this){
        if (this % i ==0){
            return false
        }
    }
    return true
}
fun Int.isQual():Boolean{
    return this % 2 == 0
}
fun Int.isInt():Boolean{
    if (this <= 100) {
        println("Введенное число равно $this")
        return false
    }else if (this > 100){
        this % 2 == 0
        println("$this")
    }
    return true
}



fun sqr(): Int{
    var arr = arrayOf<Int>(4, 5, 7, 5, 4, 8)
    arr.sort()
    var array = mutableListOf<Int>()
    for(i in arr){
        if (arr[i] != arr[i])
            array.add(i)
    }
    return array.sum()
}
fun qs(){
    num?.let {
        with(it){
            for (i in 0 until 1000){
                add((Math.random()*1000).toInt())
                var result = filter { it % 2 == 0 }.take(100)
                for(i in result){
                    println(i)
                }
            }
        }
    }
}

fun let(){
    //let используется для проверки на наличее Null. если переменная находиться вне метода(функции)
    str?.let {
        if (it.length > 3 ){
            println("notNull")
        }
    }
}
fun av(){
    val date = mapOf<String, List<Int>>(
        "file1" to listOf(15,26,57,28,39),
        "file2" to listOf(44,18,28,91,71),
        "file3" to listOf(15,22,27,22,37)
    )
    val average = date.filter { it.value.all { it>=0 } }.flatMap { it.value}.average()
}


fun ar(array: List<Int>){
    val list = mutableListOf<Int>()
    with(list){
        for (i in 0 until 1000){
            list.add((Math.random()*100).toInt())
        }
        println(this.sum())
        println(average())
        println(max())
        println(min())
        println(first())
        println(last())
    }
}

fun week(){
    val data = mapOf<String, List<Int>>(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>){

    val averageMounth = data.filter {it.value.any() {it < 0} }.map { it.key }.joinToString ()

    val average = data.filter { it.value.all { it > 0 } }.flatMap { it.value }.average()
    println("Средняя выручка в неделю: $average")

    val averageHalfSum = data.filter { it.value.all(){it >= 0} }.map { it.value.sum() }.average()
    println("Средняя выручка в месяц: $averageHalfSum")

    val averageMount = data.map { it.value.sum()}

    val max = averageMount.max()
    val min = averageMount.min()

   // val averageMax = averageMount.filter { it == averageMount.max()}.joinToString()
    println("Максимальная выручка в месяц: $max")

    val mountMax = data.filter { it.value.sum() == max }.keys.joinToString()
    println("Максимальная выручка была в месяце: $mountMax")

    //val averageMin = averageMount.filter { it == averageMount.min() }
    println("Минимальная выручка в месяц: $min")

    val mountMin = data.filter { it.value.all() {it == min} }.keys.joinToString()
    println("Минимальная выручка была в месяце: $mountMin")

    println("Ошибка произошла в следующих месяцах: $averageMounth")
}

fun sort(number:MutableList<Int>):List<Int>{
    for (i in 1 until number.size-1){
        for (j in number.size-1 downTo i){
            if (number[j] < number[j-1]){
                val tmp = number[j]
                number[j] = number[j-1]
                number[j-1] = tmp
            }
        }
    }
    return number
}

fun sort(number: Array<Int>) = sort(number.toMutableList())

fun sort(vararg number: Int) = sort(number.toMutableList())

fun p(number: Int){
    val sum = 11001
    val result = (sum/100)*number
    val resP = sum-result
    val t= resP/1000f
    val m:Float = t
    println(m)

}

fun prinInfo(lastName : String="", name : String = "", patronomic: String = ""){
    println("Фамилия $lastName")
    println("Имя $name")
    if (patronomic.isNotEmpty()){
        println("Отчество $patronomic")
    }
}

fun homWork(a:Int, b:Int=a , c:Int =a ) = a * b * c

fun sum(a:String, b:String):Int{
    try {
        val numA = a.toInt()
        val numB = b.toInt()
        return numA + numB
    }catch (e:Exception){
        println(e)
    }
    return 0
}

fun s (s : String?){
    val name = s?.length
    if (name != null){

    }
}

fun makeComplement(dna : String) : String {
    val str = StringBuilder()
    for (i in dna){
        when(i){
            'A' -> str.append('T')
            'G' -> str.append('C')
            'T' -> str.append('A')
            'C' -> str.append('G')
        }
    }
    return str.toString()
}

fun nov(){
    val detal = readln()
    val procent = readln().toInt()
    if(detal in "Двигатель" && (procent <= 51))
    {
        println("Деталь $detal: требуется замена")
    }
    else if(detal in "Двигатель" &&  procent >= 76)
    {
        println("Деталь $detal: ремонт не требуется")
    }
    else if(detal in "Корпус" && ((procent == 0) || (procent <= 25)))
    {
        println("Деталь $detal: требуется замена")
    }
    else if(detal in "Корпус" && (26 >= procent || procent <= 50))
    {
        println("Деталь $detal: требуется ремонт")
    }
    else if(detal in "Корпус" && (50 < procent))
    {
        println("Деталь $detal: ремонт не требуется")
    }
    else if(detal in "Бортовой компьютер" && (procent == 0))
    {
        println("Деталь $detal: требуется замена")
    }
    else if(detal in "Бортовой компьютер" && ( 1 == procent || procent <= 25 ))
    {
        println("Деталь $detal: требуется ремонт")
    }else
    {
        println("Деталь $detal: ремонт не требуется")
    }
}

fun m (){
    val name = readln()

    when(name){
        "этап 1" ->  println("Требуется: \nЖидкий обсидиан, 1000 тонн \nФормы для фундамента, 200 штук")
        "этап 2" -> println("Требуется: \nБалки из кортозиса, 50000 штук \nБронированные листы, 150000 штук")
        else->{ "Требуется: \nСиловой щит, 20 штук"}
    }
}

fun q(){
    val sumA = 4999.55f * 10
    val sumB = 1000 * 24
    val sumC = 25000
    val sum: Float = sumA + sumB + sumC
    print(sum.toFloat())
}

fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    val sum = threshold / content * evap_per_day
    return sum.toInt()

}

fun smallEnough(a : IntArray, limit : Int) : Boolean {
    var flag = true
    for (i in a){
        if (i > limit){
            flag = false
        } else {
            flag = true
        }
    }
    return flag
}

fun Worker.isInfo(){
    println("Имя: $name Должность: $worker Стаж: $isStage")
}

fun Cat.isOld(): Boolean{
    return  weight >= 12
}
fun Jobs.printInfo(){
    println("Имя: $name " +
            "Должность: $magory " +
            "Стаж: $exception")
}

