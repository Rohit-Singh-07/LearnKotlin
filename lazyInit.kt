// File: CompleteLazyInitExamples.kt

fun main() {
    println("=== Your Example ===")
    var user1 = Users(name = "RS", age = 23)
    val user2: Users by lazy { Users(name = "Some Name", age = 22) } // Initialized lazily
    val user3: Users by lazy { Users(name = "User3", age = 22) } // Never accessed, never initialized

    println(user2.name) // Only user2 is accessed

    println("\n=== LazyProperty Example ===")
    println(LazyExample.lazyProperty) // Will initialize now

    println("\n=== Singleton Lazy Init ===")
    println(SingletonExample.config)

    println("\n=== Custom Lazy Init ===")
    println(CustomLazyInitExample.expensiveResource)

    println("\n=== Lazy with Thread Safety Modes ===")
    println(ThreadSafeLazy.lazyValue)
    println(PublicationLazy.lazyValue)
    println(SynchronizedLazy.lazyValue)
}

// Your class
class Users(var name: String, var age: Int) {
    init {
        println("User with name: $name created")
    }
}

// Using Kotlin's built-in 'by lazy'
object LazyExample {
    val lazyProperty: String by lazy {
        println("Initializing lazyProperty...")
        "I'm a lazily initialized property!"
    }
}

// Lazy initialization in a singleton object
object SingletonExample {
    val config: String by lazy {
        println("Loading configuration...")
        "Config Loaded"
    }
}

// Custom lazy initialization using a backing field
object CustomLazyInitExample {
    private var _expensiveResource: String? = null
    val expensiveResource: String
        get() {
            if (_expensiveResource == null) {
                println("Creating expensive resource...")
                _expensiveResource = "Expensive Resource"
            }
            return _expensiveResource!!
        }
}

// Lazy with different thread-safety modes
object ThreadSafeLazy {
    val lazyValue: String by lazy(LazyThreadSafetyMode.SAFE) {
        println("Thread-safe lazy init (SAFE)...")
        "Thread-safe Lazy Value"
    }
}

object PublicationLazy {
    val lazyValue: String by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("Publication-mode lazy init...")
        "Publication Lazy Value"
    }
}

object SynchronizedLazy {
    val lazyValue: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        println("Synchronized lazy init...")
        "Synchronized Lazy Value"
    }
}
