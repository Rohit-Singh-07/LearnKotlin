fun main () {

    var car1 = Car()

    car1.name = "Dodge Challenger"
    car1.model = "Hell Cat"
    car1.color = "Black"
    car1.price = 13000000

    car1.currPrice()
    car1.move()

    val bike = Bike("Yamaha", "R15", "Blue", 160000)
    println("${bike.name} ${bike.model}, ${bike.color}, ₹${bike.price}")

    val account = BankAccount("Aarav", 75000.0)
    account.deposit(10000.0)
    account.withdraw(30000.0)
}


class Car {
    lateinit var name: String
    lateinit var model: String
    lateinit var color: String
    var price: Int? = null

    fun move () {
        println("$name is Moving")
    }

    fun stop () {
        println("Car has stoped moving")
    }

    fun currPrice () {
        print("Current price of $name, $model is $price")
    }
}


// Primary Constructor 

class BankAccount(val holderName: String, var balance: Double) {

    val accountNumber: String
    val accountType: String

    init {
        // Generate a fake account number 
        accountNumber = "AC" + (100000..999999).random()

        // Determine account type based on balance
        accountType = if (balance >= 100000) "Premium" else "Standard"

        println("Account created for $holderName")
        println("Account Number: $accountNumber")
        println("Account Type: $accountType")
    }

    fun deposit(amount: Double) {
        balance += amount
        println("Deposited ₹$amount. New balance: ₹$balance")
    }

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Insufficient funds!")
        } else {
            balance -= amount
            println("Withdrew ₹$amount. Remaining balance: ₹$balance")
        }
    }
}



// Seconcary Constructor

class Bike {
    var name: String
    var model: String
    var color: String
    var price: Int

    constructor(name: String, model: String, color: String, price: Int) {
        this.name = name
        this.model = model
        this.color = color
        this.price = price
    }
}
