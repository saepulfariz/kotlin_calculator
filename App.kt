import java.util.Scanner

fun main() {
    println("Hello World")

    // https://www.programiz.com/kotlin-programming/input-output

    print("Enter text: ")

    val stringInput = readLine()!!
    println("You entered: $stringInput")

    print("Bil 1: ")
    val bil1 = readLine()!!
    print("Bil 2: ")
    val bil2 = readLine()!!

    val result = bil1.toInt() + bil2.toInt()
    println("Result $bil1 + $bil2 = $result")
    

    println("\n=====================")

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("You entered: $integer")
}