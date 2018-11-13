package Others.LazyPropertyDelegation

import kotlin.concurrent.thread


/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */


fun <T> lazyPropertyValueFunction(provider: () -> T) = ThreadLocalLazy(provider)
val lazyPropertyValue by lazyPropertyValueFunction { Thread.currentThread().id }


fun main(args: Array<String>) {
    repeat(3) {
        thread {
            println(lazyPropertyValue) // should print three different numbers
        }
    }
}