package Basics.basicThree

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

/**
 * IDIOM - 3
*/



fun main(args:Array<String>){
    /**
     * Common For loop iteration
     */
    for(i in 1..10) print("Data: $i")
    for (i in 1 until 20) print("Until Data: $i")
    for (x in 2..10 step 2) print("Step Data: $x")
    for (x in 10 downTo 1) print("Step Data: $x")

    val x = 5
    if (x in 1..10) print("If True: $x") else print("If False: $x")
}
