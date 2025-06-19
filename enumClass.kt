// Enum class with basic usage
enum class Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// Enum class with properties and methods
enum class Month(val numberOfDays: Int) {
    JANUARY(31),
    FEBRUARY(28), // 29 in leap years
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    // Method to check if the month has 31 days
    fun has31Days(): Boolean = numberOfDays == 31
}

// Enum class with abstract methods
enum class TrafficLight(val color: String) {
    RED("Red") {
        override fun action() = "Stop"
    },
    YELLOW("Yellow") {
        override fun action() = "Caution"
    },
    GREEN("Green") {
        override fun action() = "Go"
    };

    abstract fun action(): String
}

// Enum class with custom constructor
enum class Direction(val x: Int, val y: Int) {
    NORTH(0, 1),
    SOUTH(0, -1),
    EAST(1, 0),
    WEST(-1, 0);

    // Method to calculate the next position from a given point
    fun nextPosition(x: Int, y: Int): Pair<Int, Int> {
        return Pair(x + this.x, y + this.y)
    }
}

fun main() {
    // Basic Enum usage
    println("Basic Enum")
    val today = Day.MONDAY
    println("Today is $today")

    // Loop through all values
    for (day in Day.values()) {
        println(day)
    }

    // Enum with properties and methods
    println("\nEnum with Properties")
    val february = Month.FEBRUARY
    println("February has ${february.numberOfDays} days.")
    println("Does February have 31 days? ${february.has31Days()}")

    // Enum with abstract methods
    println("\nEnum with Abstract Methods")
    val redLight = TrafficLight.RED
    println("Red light: ${redLight.action()}")
    val greenLight = TrafficLight.GREEN
    println("Green light: ${greenLight.action()}")

    // Enum with custom constructor
    println("\nEnum with Custom Constructor")
    val currentPosition = Pair(0, 0)
    val newPosition = Direction.NORTH.nextPosition(currentPosition.first, currentPosition.second)
    println("New position after moving North: $newPosition")
}
