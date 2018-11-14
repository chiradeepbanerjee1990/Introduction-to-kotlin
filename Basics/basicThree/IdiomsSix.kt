package Basics.basicThree

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */


/**
To Create a Singleton just use object
 */

object mySingleTon {
    val name = "myName"
}

class mySample {
    val name = "notWorks"
}

fun main(args: Array<String>) {
    /**
    var mysingletonobj:mySingleTon = mySingleTon() // This will throw error as the invoke of constructor wont be found
     */
    print(mySingleTon.name) //This works. No need to create an object

    /**
    print(mySample.name) // Does not work.
     */
}