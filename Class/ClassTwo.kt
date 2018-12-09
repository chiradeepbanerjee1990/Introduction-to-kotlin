package Class

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

/**
Constructors
A class in Kotlin can have a primary constructor and one or more secondary constructors.
The primary constructor is part of the class header: it goes after the class name (and optional type parameters).
*/

class Person constructor(firstName:String, lastName:String){    }

//OR

/**
 * If the primary constructor does not have any annotations or visibility modifiers,
 * the constructor keyword can be omitted
 */
class PersonNoConstructor (firstName: String) {

}

/**
The primary constructor cannot contain any code. Initialization code can be placed in
initializer blocks, which are prefixed with the init keyword.
*/

class PersonInit(PersonName: String){
    val firstProperty = "First property: $PersonName".also(::println)

    init {
        println("First initializer block that prints ${PersonName}")
    }

    val secondProperty = "Second property: ${PersonName.length}".also(::println)

    init {
        println("Second initializer block that prints ${PersonName.length}")
    }

    /**Note that parameters of the primary constructor can be used in the initializer blocks.
     * They can also be used in property initializers declared in the class body
     */

    val personNameToUpper = PersonName.toUpperCase()


}

fun main(args:Array<String>){
    PersonInit("Chiradeep")

}