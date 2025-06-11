fun main() {
    //Basic Try-Catch 
    try {
        val result = 10 / 0  // ArithmeticException (divide by zero)
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")  // Catch specific exception and print error message
    }

    //Try-Catch with Multiple Exceptions
    try {
        val number = "abc".toInt()  // This will cause a NumberFormatException
    } catch (e: ArithmeticException) {
        println("ArithmeticException: ${e.message}")
    } catch (e: NumberFormatException) {
        println("NumberFormatException: ${e.message}")  
    }

    // General Exception
    try {
        val result = 10 / 0  
    } catch (e: Exception) {
        println("General Exception: ${e.message}")  
    }

    // Finally Block 
    try {
        println("Inside try block")
        val result = 10 / 2  // No error here
    } catch (e: Exception) {
        println("Inside catch block")
    } finally {
        println("Inside finally block")  // Will always be executed, regardless of exception
    }

    // Throwing an Exception
    try {
        checkAge(15)  // We will throw an exception if age < 18
    } catch (e: IllegalArgumentException) {
        println("Caught exception: ${e.message}")
    }

    // Rethrowing an Exception
    try {
        processPayment(0)  // We pass 0 to simulate a payment error
    } catch (e: IllegalArgumentException) {
        println("Caught exception, rethrowing it...")
        throw e  // Rethrow the exception after logging
    }

    // Creating and Throwing Custom Exceptions
    try {
        validatePassword("123")  // A weak password
    } catch (e: WeakPasswordException) {
        println("Caught custom exception: ${e.message}")
    }

    // Nested Try-Catch Blocks
    try {
        try {
            val num = "10a".toInt()  // This will cause a NumberFormatException
        } catch (e: NumberFormatException) {
            println("Inner catch block: Invalid number format")
            throw e  // Rethrow the exception to the outer block
        }
    } catch (e: Exception) {
        println("Outer catch block: Caught exception: ${e.message}")
    }
}

// Function to check age and throw an exception if under 18
fun checkAge(age: Int) {
    if (age < 18) {
        throw IllegalArgumentException("Age must be 18 or older")
    } else {
        println("Age is valid: $age")
    }
}

// Function to simulate payment processing and throw an exception for invalid payment amount
fun processPayment(amount: Int) {
    if (amount <= 0) {
        throw IllegalArgumentException("Payment amount must be greater than 0")
    }
    println("Payment of $$amount processed successfully.")
}

// Custom Exception for weak passwords
class WeakPasswordException(message: String) : Exception(message)

fun validatePassword(password: String) {
    if (password.length < 6) {
        throw WeakPasswordException("Password is too weak. It should be at least 6 characters long.")
    } else {
        println("Password is valid.")
    }
}
