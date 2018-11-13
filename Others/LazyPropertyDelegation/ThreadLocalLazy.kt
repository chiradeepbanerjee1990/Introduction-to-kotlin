package Others.LazyPropertyDelegation

import java.util.*


/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

/**
 *lazy properties: the value gets computed only upon first access
 */

class ThreadLocalLazy<T>(val provider: () -> T) : Lazy<T> {
    private val threadLocal = object : ThreadLocal<Lazy<T>>() {
        override fun initialValue(): Lazy<T> =
                lazy(LazyThreadSafetyMode.NONE, provider)
    }

    override val value get() = threadLocal.get().value
    override fun isInitialized() = threadLocal.get().isInitialized()
}




