package Basics.basicTwo

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

/**
 * We have already seen how to declare function in the first example. Now in this class we will see
 * the variations we can use to write define and declaring functions.
 *
 * In this example we will run our functions from a class.
 */

class IntroToFunctions {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            IntroToFunctions().printSum(firstVal = 5, secondVal = 10)
        }
    }


    fun printSum(firstVal: Int, secondVal: Int) {
        println("sum of $firstVal and $secondVal is ${firstVal + secondVal}")
        /* OR */
        println("sum of $firstVal and $secondVal is " + (firstVal + secondVal))

    }

    /**
     * Comparison function using descriptive style
     */
    fun maxValueOfTwo(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    /**
     * Comparison function using shorter style
     */
    fun maxValueOfTwoShort(a: Int, b: Int) = if (a > b) a else b

    /**
     * Null value check / Nullable return in fun
     */
    fun parseInt(s: String): Int? {
        /**
         * If-else block can be converted to when block
         * when(arg)
         * {
         *      true -> return "Truth"
         *      false -> return "False"
         * }
         */
//        when(s){
//            null -> return null
//            else -> return Integer.parseInt(s)
//        }
        /**
         * We can lift return from individual case and write on top
         */
        return when (s) {
            null -> null
            else -> Integer.parseInt(s)
        }
    }

}
