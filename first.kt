fun main() {
    val name: String = "Kotlin"
    println("Hello, $name!")

    // String Functions

    var str1 = "This is a sample string"

    println("This is how you print var with string: \"$str1\"")

    var str = "hello world"

    var num = 249186

    println(str.indexOf('o')) // 4
    println(str.lastIndexOf('o')) // last appearance of o
    println(str.compareTo("helloo")) // > 0 since "hello world" > "hello"
    println(str.equals("hello world")) // true
    println(num.toString()) // "hello world"

    println(str.length) // 11
    println(str.get(0)) // 'h'
    println(str.substring(0, 5)) // "hello"
    println(str.contains("wor")) // true
    println(str.startsWith("he")) // true
    println(str.endsWith("ld")) // true
    println(str.replace('l', 'x')) // "hexxo worxd"
    println(str.split(' ')) // [hello, world]
    println(str.uppercase()) // "HELLO WORLD"
    println(str.trim()) // "hello world"
    println(str.isEmpty()) // false
    println(str.isBlank()) // false
    println("abc".repeat(3)) // "abcabcabc"
}
