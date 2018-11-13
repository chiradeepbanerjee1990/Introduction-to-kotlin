package Basics.basicThree

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */


/**
 * We can initialize any property of a class by passing value in Constructor[From Java] or by using "lateinit" and "lazy" [in Kotlin Terms]
 */

/**
 * Normally, properties declared as having a non-null type must be initialized in the constructor.
 * However, fairly often this is not convenient. For example, properties can be initialized through
 * dependency injection, or in the setup method of a unit test. In this case,
 * you cannot supply a non-null initializer in the constructor, but you still want to avoid null checks
 * when referencing the property inside the body of a class.
 *
 * lateinit => late initialization
 */
lateinit var myName: String

// val myFriendsName: String = "Chiradeep" -- This is waste of memory. At this time we dont know the variable will be used or not
/**
 * lazy() is a function that takes a lambda and returns an instance of Lazy<T> which can serve as a
 * delegate for implementing a lazy property: the first call to get()
 * executes the lambda passed to lazy() and remembers the result, subsequent calls to get() simply return the remembered result
 *
 * By default, the evaluation of lazy properties is synchronized: the value is computed only in one thread,
 * and all threads will see the same value. If the synchronization of initialization delegate is not required,
 * so that multiple threads can execute it simultaneously, pass LazyThreadSafetyMode.PUBLICATION as a parameter
 * to the lazy() function. And if you're sure that the initialization will always happen on a single thread,
 * you can use LazyThreadSafetyMode.NONE mode, which doesn't incur any thread-safety guarantees and the related overhead.
 *
 * – lazy function (thread-safe by default) returns an object that has getValuemethod called.
– parameter of lazy is a lambda to initialize the value.
 */
val myFriendsName: String by lazy {
    /**
     * The first call to get() executes the lambda expression passed to lazy() as an argument and remembers the result
    Subsequent calls to get() simply return the remembered result.
     */
    println("Lazy initialized")
    "Chiradeep"
}


fun main(args: Array<String>) {
    /**
     * If we don't initialize myName property and try to acess the value we will get
     * below exception
     *
     * Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property myName has not been initialized
     */
    //print(myName)
    /**
     * Now initialize and access the value
     */
    myName = "Chiradeep"
    print(myName + "\n")


    /**
     * Lazy initialization was designed to prevent unnecessarey intialization of objects.
     * Our variables wont be initialized untill and unless we use those.
     * It is initialized only once. After that the value will be returned from cache.
     * It is thread safe, meaning it is initialized in the thread where it is used for the first time.
     */


    println(myFriendsName)
    println(myFriendsName)
    println(myFriendsName)


}
