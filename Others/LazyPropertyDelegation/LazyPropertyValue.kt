package Others.LazyPropertyDelegation

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */
abstract class LazyPropertyValue<T> {
    var data: T? = null
    private fun initialValue(data: T): T {
        return data
    }

    private fun setInitialValue(data: T): T {
        val value = initialValue(data)
        return value
    }

    fun get(): T {
        var value: T = initialize()
        return setInitialValue(value)
    }

    abstract fun initialize(): T


}