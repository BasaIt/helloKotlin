package kot

import java.util.stream.IntStream.concat

class CodeWars{}

fun izzBuzz(n: Int): MutableList<String> {
        //TODO: Enter your code here!
        var array = mutableListOf<String>()
        if (n % 3 == 0){
            array.add("Fizz")
        }else if(n % 5 == 0){
            array.add("Buzz")
        }else if (n % 3 == 0 && n % 5 == 0){
            array.add("FizzBuzz")
        }else{
            array
        }
        return array
    }

fun getCount(str : String) : Int {
    var count = 0
    for(i in 0 until str.length){
        var l = str[i]
        when(l){
            'a', 'e', 'i', 'o', 'u' ->count++
        }
    }
    return count
}

fun longest(s1:String, s2:String):String {
    // your code
    val str = s1.plus(s2)
    val sort = str.toList().sorted().distinct().joinToString()
    return sort.replace(",".toRegex(), "")
}

fun twoOldestAges(ages: List<Int>): List<Int> {
    var maxFirst = ages.max()
    var maxSecond = ages.max()
    var result = ages.toList()
    return result

    return listOf(0, 0)
}

fun isLeapYear(year: Int) : Boolean {
    // code here
    var boolean = false
    return year % 4 == 0 || year % 100 != 0 || year % 400 == 0
}

fun potatoes(p0:Int, w0:Int, p1:Int):Int {
    // your code
    return (w0 * (100-p0)/(100-p1))
}

fun catMouse(s: String): String {
    var name = ""
    for(i in s.indices){
        if(i <= 3){
            name = "Caught!"
        }else{
            name = "Escaped!"
        }
    }
    //Your code goes here!
    return name
}

fun repeats(arr: IntArray): Int {
    arr.sort()
    var array = mutableListOf<Int>()
    for(i in 0..arr.size){
        if (arr[i] != arr[i-1])
            array.add(i)
    }
    return array.sum()
}

fun argsCount(vararg args: Any): Int {
    var count = 0
    return args.count()
  
}

