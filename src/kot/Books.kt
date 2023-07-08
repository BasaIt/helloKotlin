package kot

class Books(val name : String, var age : Int? = null, var price : Int? = null ) {
    constructor():this("L",0, 0)
}