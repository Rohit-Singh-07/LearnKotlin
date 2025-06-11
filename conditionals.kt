fun main() {
    // Simple if-else
    val number = 10
    if (number > 0) {
        println("The number is positive.")
    } else {
        println("The number is non-positive.")
    }

    // Nested if-else
    val age = 20
    if (age >= 18) {
        if (age >= 21) {
            println("You are an adult and can drink alcohol in some countries.")
        } else {
            println("You are an adult but cannot drink alcohol in some countries.")
        }
    } else {
        println("You are a minor.")
    }

    // if-else with multiple conditions
    val score = 85
    if (score >= 90) {
        println("You got an A grade!")
    } else if (score >= 80) {
        println("You got a B grade!")
    } else if (score >= 70) {
        println("You got a C grade!")
    } else {
        println("You need to improve.")
    }

    // Using when expression to match multiple conditions
    val dayOfWeek = 5
    when (dayOfWeek) {
        1 -> println("It's Monday.")
        2 -> println("It's Tuesday.")
        3 -> println("It's Wednesday.")
        4 -> println("It's Thursday.")
        5 -> println("It's Friday.")
        6 -> println("It's Saturday.")
        7 -> println("It's Sunday.")
        else -> println("Invalid day number!")
    }

    // Using when to check types
    val anyValue: Any = "Hello"
    when (anyValue) {
        is Int -> println("It's an Integer.")
        is Double -> println("It's a Double.")
        is String -> println("It's a String.")
        else -> println("Unknown type.")
    }

    // Using if with a range check
    val temperature = 25
    if (temperature in 15..30) {
        println("The temperature is within a comfortable range.")
    } else {
        println("The temperature is either too low or too high.")
    }

    // Combining logical operators in if conditions
    val isWeekend = true
    val isHoliday = false
    if (isWeekend || isHoliday) {
        println("You can relax today!")
    } else {
        println("It's a workday.")
    }

    // Ternary-like expression using if-else
    val max = if (10 > 5) 10 else 5
    println("The maximum value is: $max")

    // Nested when expression
    val numberToCheck = 4
    when {
        numberToCheck % 2 == 0 -> println("It's an even number.")
        numberToCheck % 2 != 0 -> println("It's an odd number.")
        else -> println("Not a valid number.")
    }

    // Multiple conditions in when with ranges
    val temperatureInCelsius = 30
    when (temperatureInCelsius) {
        in 30..40 -> println("Hot weather.")
        in 20..29 -> println("Warm weather.")
        in 10..19 -> println("Cool weather.")
        else -> println("Cold weather.")
    }

    // Using `if` to assign values (in one line)
    val num1 = 5
    val num2 = 10
    val larger = if (num1 > num2) num1 else num2
    println("The larger number is: $larger")
}
