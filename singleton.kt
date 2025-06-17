// Example of companion class
class User private constructor(val name: String, val age: Int) {

    companion object {
        fun createFromCSV(csv: String): User {
            val parts = csv.split(",")
            val name = parts[0].trim()
            val age = parts[1].trim().toInt()
            return User(name, age)
        }
    }

    fun showInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val user = User.createFromCSV("Alice, 30")
    user.showInfo() 
    
     // Accessing the singleton directly
    AppConfig.printConfig()

    // Modifying a property
    AppConfig.maxUsers = 200

    // Accessing again to see the change
    AppConfig.printConfig()
}


object AppConfig {
    val appName = "MyApp"
    var maxUsers = 100

    fun printConfig() {
        println("App Name: $appName, Max Users: $maxUsers")
    }
}

