package Functions.extensionFun

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

/**
 * The below example shows the default extension functions provided by kotlin
 */

 var myList:MutableList<Int> = mutableListOf(1,2,3,4,5,6,7)
 val reverseList:List<Int> = myList.asReversed() //returns a read only reverse list. Kotlin extension func

fun main(args:Array<String>) {

    /**
     * foreachindex is an unique way to iterate through a list.
     * To iterate through arr we can use foreach -> lambda
     */
    reverseList.forEachIndexed { index, elem -> print("$index and value ${reverseList.get(index)}\n") }

    /**
     * Below we will show few extension function used in mutableList by default. Default extension functions
     * are inherited from MutableCollection.kt class
     */

    /**
     * Returns the last element.
     * @throws [NoSuchElementException] if the list is empty.
     */
    val lastElem = myList.last()
    print("$lastElem\n")

    /**
     * Returns the last element matching the given [predicate].
     * @throws [NoSuchElementException] if no such element is found.
     */
    val lastElemPred = myList.last { it > 5 }
    print("Last element from predicate => $lastElemPred\n")


    /**
     * Randomly shuffles elements in this mutable list.
     */
    myList.shuffle()
    myList.forEachIndexed { index, element -> print("\nafter shuffle element for index => $index and value will be => $element ") }

    /**
     * Sorts elements in the list in-place according to their natural sort order.
     */
    myList.sort()
    /**
     * Adds the specified [element] to this mutable collection.
     */
    myList.plusAssign(41)
    /**
     * Removes a single instance of the specified [element] from this mutable collection.
     */
    myList.minusAssign(2)

    print("\nThe list still stays sorted ")
    myList.forEachIndexed { index, element -> print("\nAssignment after sorted list for index => $index and value will be => $element ") }


    /**
     * Retains only elements of this [MutableList] that match the given [predicate].
     */
    myList.retainAll { it in 3..9 } // it means this and the predicate returns the list when elemnet > 2 and <10}
    myList.forEachIndexed { index, element -> print("\nRetain All Predicate after for index => $index and value will be => $element ") }

}