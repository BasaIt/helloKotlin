package kot

class Adres(val town:String, val street:String, val number: Int) {
    operator fun component1 () = town
    operator fun component2 () = street
    operator fun component3 () = number
}



