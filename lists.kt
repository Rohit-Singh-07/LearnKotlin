fun main() {
    // Creating Lists
    val immutableList = listOf(1, 2, 3, 4, 5)  
    println("Immutable List: $immutableList")

    // Accessing Elements
    val firstElement = immutableList[0]
    val lastElement = immutableList[immutableList.size - 1]
    println("First element: $firstElement, Last element: $lastElement")

    // terating over a List using for loop
    println("\nIterating over a List:")
    for (element in immutableList) {
        println(element)  
    }

    // Iterating using forEach
    println("\nUsing forEach to iterate:")
    immutableList.forEach { element ->
        println(element)  
    }

    // Looping with index using forEachIndexed
    println("\nIterating over a List with index:")
    immutableList.forEachIndexed { index, element ->
        println("Index $index: $element") 
    }

    // List Operations: Adding, Removing elements
    val mutableList = mutableListOf(1, 2, 3, 4)
    println("\nOriginal Mutable List: $mutableList")

    // Adding elements
    mutableList.add(5)
    mutableList.add(6)
    println("After adding elements: $mutableList")

    // Removing elements
    mutableList.remove(3)  // Removes the element "3"
    mutableList.removeAt(1)  // Removes element at index 1
    println("After removing elements: $mutableList")

    // List Transformation: Mapping
    val doubledList = immutableList.map { it * 2 }
    println("\nDoubled List using map: $doubledList")

    // Filtering Lists
    val filteredList = immutableList.filter { it % 2 == 0 }  
    println("\nFiltered List (even numbers): $filteredList")

    // Sorting Lists
    val sortedList = immutableList.sorted()  // Sorting in ascending order
    println("\nSorted List: $sortedList")

    val reverseSortedList = immutableList.sortedDescending()  // Sorting in descending order
    println("Sorted List (Descending): $reverseSortedList")

    // Checking conditions on a list
    val containsThree = immutableList.contains(3)  
    println("\nDoes the list contain 3? $containsThree")

    val isEmpty = immutableList.isEmpty()  
    println("Is the list empty? $isEmpty")

    // List size and slicing
    println("\nList size: ${immutableList.size}")  
    println("Slicing the list: ${immutableList.subList(1, 4)}")  

    // Flattening a list of lists
    val nestedList = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))
    val flattenedList = nestedList.flatten()  
    println("\nFlattened List: $flattenedList")

    // Using reduce to accumulate values
    val sum = immutableList.reduce { acc, i -> acc + i } 
    println("\nSum of elements using reduce: $sum")

    // Using fold to accumulate values with an initial value
    val product = immutableList.fold(1) { acc, i -> acc * i }  
    println("\nProduct of elements using fold: $product")

    // Grouping elements (e.g., grouping numbers by their even or odd property)
    val grouped = immutableList.groupBy { if (it % 2 == 0) "Even" else "Odd" }
    println("\nGrouped List (Even vs Odd): $grouped")

    // Checking for existence of any or all elements in the list
    val hasEven = immutableList.any { it % 2 == 0 }  // Check if there's any even number
    println("\nIs there any even number in the list? $hasEven")

    val allEven = immutableList.all { it % 2 == 0 }  // Check if all elements are even
    println("Are all elements even? $allEven")

    // Using first and last to get the first and last elements of the list
    val firstItem = immutableList.first()  
    val lastItem = immutableList.last()  
    println("\nFirst item: $firstItem, Last item: $lastItem")

    // Using distinct to remove duplicates
    val listWithDuplicates = listOf(1, 2, 2, 3, 3, 3)
    val distinctList = listWithDuplicates.distinct()  
    println("\nList with duplicates removed: $distinctList")
}
