// Basic Inner Class Example
class OuterClass1 {
    private val outerProperty = "I'm an outer class property"

    // Inner class can access the outer class' members, including private ones
    inner class InnerClass {
        fun printOuterProperty() {
            println("Outer class property: $outerProperty")
        }
    }
}

// Inner Class with Constructor Parameters Example
class OuterClass2(val outerName: String) {

    inner class InnerClass(val innerName: String) {
        fun displayNames() {
            println("Outer class name: $outerName, Inner class name: $innerName")
        }
    }
}

// Example 3: Using Inner Class for Callbacks
class OuterClass3 {

    private val callbackData = "Data from outer class"

    // Callback interface with a method
    interface Callback {
        fun onDataReceived(data: String)
    }

    // Inner class that implements the callback interface
    inner class InnerClass : Callback {
        override fun onDataReceived(data: String) {
            println("Callback received: $data")
        }

        fun initiateCallback() {
            onDataReceived(callbackData)  // Accessing outer class property in callback
        }
    }
}

// Inner Class with Custom Behavior Example
class OuterClass4(val name: String) {

    // Inner class modifying the outer class property
    inner class InnerClass {
        fun changeOuterName(newName: String) {
            println("Changing outer class name from '$name' to '$newName'")
        }
    }
}

// Using `this@OuterClass` to Access Outer Class from Inner Class
class OuterClass5(val outerProperty: String) {

    inner class InnerClass {
        fun printOuter() {
            // Directly accessing outer class property from the inner class
            println("Outer class property from inner class: $outerProperty")
        }
    }
}


// Main function to demonstrate the inner class examples
fun main() {

    // basic Inner Class
    val outer1 = OuterClass1()
    val inner1 = outer1.InnerClass()
    inner1.printOuterProperty()  // This prints: Outer class property: I'm an outer class property

    println("-----")

    // Inner Class with Constructor Parameters
    val outer2 = OuterClass2("Outer")
    val inner2 = outer2.InnerClass("Inner")
    inner2.displayNames()  // This prints: Outer class name: Outer, Inner class name: Inner

    println("-----")

    // Using Inner Class for Callbacks
    val outer3 = OuterClass3()
    val inner3 = outer3.InnerClass()
    inner3.initiateCallback()  // This prints: Callback received: Data from outer class

    println("-----")

    // Inner Class with Custom Behavior
    val outer4 = OuterClass4("Old Name")
    val inner4 = outer4.InnerClass()
    inner4.changeOuterName("New Name")  // This prints: Changing outer class name from 'Old Name' to 'New Name'

    println("-----")

    // Using `this@OuterClass` to Access Outer Class from Inner Class
    val outer5 = OuterClass5("Hello from outer class!")
    val inner5 = outer5.InnerClass()
    inner5.printOuter()  // This prints: Outer class property from inner class: Hello from outer class!
}
