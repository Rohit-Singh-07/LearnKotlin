fun main() {
    // Basic for loop - Looping through a range
    println("Basic for loop (1 to 5):")
    for (i in 1..5) {
        println(i)  
    }

    // Looping with step value
    println("\nFor loop with a step value (1 to 10 with step 2):")
    for (i in 1..10 step 2) {
        println(i)  
    }

    // For loop with downTo (decrementing)
    println("\nFor loop with downTo (10 down to 1):")
    for (i in 10 downTo 1) {
        println(i)  
    }

    // Looping through a list
    val numbers = listOf(2, 4, 6, 8, 10)
    println("\nFor loop through a list:")
    for (num in numbers) {
        println(num)  
    }

    // For loop with indices
    val words = arrayOf("apple", "banana", "cherry")
    println("\nFor loop with indices:")
    for (index in words.indices) {
        println("Index $index has value ${words[index]}")  // Prints index and corresponding value
    }

    // Nested for loop (multiplication table)
    println("\nNested for loop (multiplication table):")
    for (i in 1..3) {
        for (j in 1..3) {
            println("$i x $j = ${i * j}")
        }
    }

    // While loop - basic usage
    var counter = 1
    println("\nBasic while loop (counting to 5):")
    while (counter <= 5) {
        println(counter)  
        counter++
    }

    // Do-while loop - ensure the loop executes at least once
    var counterDoWhile = 1
    println("\nDo-while loop (counting to 5):")
    do {
        println(counterDoWhile)  
        counterDoWhile++
    } while (counterDoWhile <= 5)

    // Repeat function (repeating an action multiple times)
    println("\nUsing repeat() function (repeat 3 times):")
    repeat(3) {
        println("This is repetition #${it + 1}") 
    }

    // Break and continue in loops
    println("\nUsing break and continue:")
    for (i in 1..10) {
        if (i == 5) {
            println("Skipping number 5")
            continue  
        }
        if (i == 8) {
            println("Stopping the loop at number 8")
            break  
        }
        println(i)  
    }

    // Infinite loop with a break condition
    println("\nInfinite loop with a break condition:")
    var infiniteCounter = 0
    while (true) {
        infiniteCounter++
        if (infiniteCounter == 5) {
            println("Breaking after 5 iterations")
            break  // Breaks after 5 iterations
        }
        println("Iteration $infiniteCounter")
    }
}
