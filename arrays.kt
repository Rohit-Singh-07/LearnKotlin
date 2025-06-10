fun main() {
    var array = intArrayOf(1, 2, 3, 4)

    array = intArrayOf(4,4,4,4, 5)

    println(array.joinToString(", "))  

    val evenNumbers = arrayOf(2, 4, 6, 8, 10)
    val oddNumbers = arrayOf(1, 3, 5, 7, 9)

    // Add corresponding elements and print the results
    for (i in evenNumbers.indices) {
        val sum = evenNumbers[i] + oddNumbers[i]
        println("Sum of even ${evenNumbers[i]} and odd ${oddNumbers[i]} is: $sum")
    }

    val joey = "How you doin"

    println(joey[1])


    val inputString = "I am a Kotlin programmer now"
    
    // Call the function and get the array of indices
    val vowelIndices = findVowelIndices(inputString)
    
    println("Indices of vowels: ${vowelIndices.joinToString(", ")}")
    
    // Calculate and print the sum of the indices
    val sum = vowelIndices.sum()
    println("Sum of the indices: $sum")
}


fun findVowelIndices(str: String): ArrayList<Int> {
    val vowels = "aeiouAEIOU"  // Vowels to check (both lowercase and uppercase)
    val indices = ArrayList<Int>()  // ArrayList to store the indices of vowels
    
    // Iterate through the string
    for (i in str.indices) {
        if (str[i] in vowels) {
            indices.add(i)  // Add the index to the list if it's a vowel
        }
    }
    
    return indices
}
