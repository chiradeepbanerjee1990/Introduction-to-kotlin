package Basics.basicTwo

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

open class A{
    // Here the term "open" makes the function not final else by default any method under a class will be final
    /**
     * the open keyword allows you to override classes, when used in the class declaration. Accordingly,
     * declaring a property as open, allows subclasses to override the property itself (e.g., redefine getter/setter).
     * That keyword is required since in Kotlin everything is "final" by default, meaning that you can't override it
     */
    open fun myA(i : Int = 10){
        print("value of i = $i")
    }
}

class B: A(){
    /*override fun myA(i: Int = 5) { // ERROR.
    //An overriding function is not allowed to specify default values for its parameters
        super.myA(i)
    }*/

    override fun myA(i: Int) { // Works
        super.myA(i)
    }
}