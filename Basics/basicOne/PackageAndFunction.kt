package Basics.basicOne

//This is the way to define package. Don't worry it will be auto created by IDE

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

/**
 * Main Function. Static/public no external declaration needed.
 * You can't put main() inside a class in Kotlin. In Java it must be static, as it requires the class to load
 * the function main in order to drive the class.
 * The only way to make a function static in Kotlin is to put it directly under a package. So, basically
 * we are still creating main() static but not inside the class but inside the package/globally.
 *
 * There is another way though to make main() static and declare under the class. We can
 * put a main() fun inside a class, and make it a static method of JVM, by using the @JvmStatic annotation.
 *
 * We will see both use-case
 */


/**
 * This is default main fun. This is not declared inside any class but directly inside the package.
 */
fun main(args: Array<String>) {
    print("Running from package main")

}
