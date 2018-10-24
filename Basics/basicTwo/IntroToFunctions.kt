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
 *
 * Function in kotlin is defined by the word "fun"
 */

fun main(args: Array<String>) {
    printSum(firstVal = 5, secondVal = 10)
    // For Default arg fun call check
    myDeafaultDeclaredFunction(myDynamicPref = "Hello John")
    // However we can always override the default value as well
    myDeafaultDeclaredFunction(myname = "Deep", myDynamicPref = "Hello Deep")
}


/**
 * Function parameters are defined using Pascal notation, i.e. name: type.
 * Parameters are separated using commas. Each parameter must be explicitly typed
 */
fun printSum(firstVal: Int, secondVal: Int) {
    println("sum of $firstVal and $secondVal is ${firstVal + secondVal}")
    /* OR */
    println("sum of $firstVal and $secondVal is " + (firstVal + secondVal))

}

/**
 * Function parameters can have default values, which are used when a corresponding argument is omitted.
 * This allows for a reduced number of overloads compared to other languages
 *
 * Default values are defined using the = after type along with the value.
 */
fun printSum(firstVal: Int = 5, secondVal: Int, thirdVal: Int) {
    println("sum of $firstVal, $secondVal and $thirdVal is = ${firstVal + secondVal + thirdVal}")
}


/**
 * Default argument use case and calling the function by only its dynamic value
 */
fun myDeafaultDeclaredFunction(myname: String = "John", myAge: Int = 35, myFavCol: String = "Black", myDynamicPref: String) {
    println("myName value = ${myname}, myAge value = ${myAge}, myFavCol value = ${myFavCol} and myDynamicPref value = ${myDynamicPref}")
}

/**
 * Comparison function using descriptive style. The below style is bad.
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

/**
 * The "is" operator checks if an expression is an instance of a type.
 * If an immutable local variable or property is checked for a specific type,
 * there's no need to cast it explicitly
 *
 * Ref: https://kotlinlang.org/docs/reference/basic-syntax.html
 */
fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}


