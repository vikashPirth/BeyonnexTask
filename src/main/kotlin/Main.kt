import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val anagram = Anagram()

    while (true) {
        println("Enter the first string (or type 'exit' to end the Programme):")
        val firstString = scanner.nextLine()
        if (firstString == "exit") break

        println("Enter the second string:")
        val secondString = scanner.nextLine()

        val result = anagram.areAnagrams(firstString, secondString)
        println("Are anagrams? $result")

        if (result) {
            println("Anagrams of \"$firstString\": ${anagram.getAnagrams(firstString)}")
        }
    }

    println("Exiting the program.")
}
