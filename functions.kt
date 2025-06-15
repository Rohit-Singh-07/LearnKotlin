fun main() {
    timesThree(5)  
    timesFour(4)
    aFunction(4, 5)

    val num1 = 10
    val num2 = 20
    println("The maximum of $num1 and $num2 is: ${findMax(num1, num2)}")
    println("The maximum of $num1 and $num2 is: ${maxOf(num1, num2)}") // built in maxOf

    theVarArg(1,5,6,4,8,2)
}

fun timesThree(a: Int): Unit {
    val x = a * 3
    println(x)
}

fun timesFour (a: Int) = println(a * 4)

fun aFunction(a: Int, b: Int) {

    println("sum of $a and $b = ${a + b}")
    
    println("difference of $a and $b = ${a - b}")
    
    println("product of $a and $b = ${a * b}")
    
    println("division of $a and $b = ${a / b}")
}

fun findMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//vararg to take parameter in form of array(for undefined length)

fun theVarArg(vararg numbers: Int) {
    numbers.forEach { 
        print("$it, ")
     }
}