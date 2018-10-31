package Basics.basicThree

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

    /**
     * Default values for function parameters
     */
    fun foo(a: Int = 0, b: String = "") { print("") }


    /**
     * Calling a function Ideal way
     * foo(a = 2, b = "John") // Good way
     * foo(2,"John") // Bad way
     */

    val list: List<Int> = listOf(1,2,3,4,5) //This is only read only list
    val mutList:MutableList<Int> = mutableListOf(1,2,4,5,7,8)
    val highest = list.filter { x -> x > 4 } //filter is just an example over here which is taking lambda fun and will return 5 here.



    fun main(args: Array<String>){
        print("The filtered number = $highest\n")

        /**
         * add or remove option for list is only available for mutableList
         */
        mutList.add(9)
    }
