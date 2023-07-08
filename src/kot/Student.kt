package kot

class Student(val name:String, val lastName: String, val id:String ) {
    operator fun component1( ) = name
    operator fun component2( ) = lastName
    operator fun component3( ) = id
    fun copy(name:String = this.name,  lastName: String = this.lastName,  id:String = this.id):String{
        return copy(name, lastName, id)
    }

}
