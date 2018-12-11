package Class

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

/**
Secondary Constructors

The class can also declare secondary constructors, which are prefixed with constructor
*/

data class User(var firstName:String, var lastName:String)


class SecondaryConstructor(val firstName: String, val lastName: String) //This is Primary Constructor
{

    /**
     * If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
     * either directly or indirectly through another secondary constructor(s). Delegation to another constructor
     * of the same class is done using the this keyword:
     */
    constructor(firstName: String, lastName:String,  information: User) : this(firstName,lastName) //This is Super call
    {
        information.firstName = firstName
        information.lastName = lastName

    }

}

/**
 * Note that code in initializer blocks effectively becomes part of the primary constructor.
 * Delegation to the primary constructor happens as the first statement of a secondary constructor,
 * so the code in all initializer blocks is executed before the secondary constructor body. Even if the class has no primary constructor,
 * the delegation still happens implicitly, and the initializer blocks are still executed
 */


class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}

/**
 * If a non-abstract class does not declare any constructors (primary or secondary),
 * it will have a generated primary constructor with no arguments.
 * The visibility of the constructor will be public. If you do not want your class to have a public constructor,
 * you need to declare an empty primary constructor with non-default visibility
 */

class DontCreateMe private constructor () {}