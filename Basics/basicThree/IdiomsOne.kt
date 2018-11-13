package Basics.basicThree

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */
/**
 * A collection of random and frequently used idioms in Kotlin.
 */

/**
 * IDIOM - 1
 * Creating a POJO class is easy and by default provides frequently used methods
 */

/**
 * Data class primary constructor must have only property (val/var) parameters
 *
 * val and var both are used to declare a variable. var is like general variable and
 * its known as a mutable variable in kotlin and can be assigned multiple times.
 * val is like constant variable and its known as immutable in kotlin and can be initialized only single time.
 */
data class UserDetails(val name: String, val email: String)

/**
 * Above declaration makes below methods automatically overrides in the class
 * getters (and setters in case of vars) for all properties
   equals()
   hashCode()
   toString()
   copy()
   component1(), component2(), …, for all properties . Component function usage we will see more in data class module
*/

