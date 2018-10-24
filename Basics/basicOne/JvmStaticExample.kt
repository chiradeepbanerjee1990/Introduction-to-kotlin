package Basics.basicOne

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */


/**
 * Names of classes and objects start with an upper case letter and use camel humps
 */
class JvmStaticExample {

    /**
     * It is necessary to use companion object to write JvmStatic annotation. Without this compiler
     * will throw error.
     *
     * What is Companion Object:
     *
     *  Unlike Java or C#, Kotlin doesn’t have static members or member functions.
     *  Kotlin recommends to simply use package-level functions instead.
     *  If you need to write a function that can be called without having a class
     *  instance but needs access to the internals of a class, you can write it as a
     *  member/ functions of a companion object declaration inside that class. By declaring a
     *  companion object inside our class, you’ll be able to call its members/functions with the same
     *  syntax as calling static methods in Java/C#, using only the class name as a qualifier.
     */
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            print("From static method\n")
            val objectJvmStatic = JvmStaticExample()
            objectJvmStatic.secondFunction()
        }

        @JvmStatic fun myStaticFun() = print("Successfully called")
    }

    /**Just to ensure secondFunction does not get
     * loaded statically like main function in this case
     */
    fun secondFunction() {
        println("Second Function Called")
        //We can call main function from here
        JvmStaticExample.myStaticFun()
    }

    /**
     * Names of functions, properties and local variables start with a
     * lower case letter and use camel humps and no underscores
     */
    fun functionNameIllustration(){
        var myVariable : Int = 5
    }

}