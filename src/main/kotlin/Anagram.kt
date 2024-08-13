import java.util.*

class Anagram{

    private val anagramMap = mutableMapOf<String, MutableSet<String>>()

    fun areAnagrams(firstString: String, secondString: String): Boolean {
        val sortedS1 = cleanAndSort(firstString)
        val sortedS2 = cleanAndSort(secondString)

        // Perform the checks after cleaning and sorting
        if (sortedS1.isEmpty() && sortedS2.isEmpty()) return false
        if (sortedS1.length != sortedS2.length) return false

        if (sortedS1 == sortedS2) {
            // Store the anagrams
            anagramMap.computeIfAbsent(sortedS1) { mutableSetOf() }.apply {
                add(firstString)
                add(secondString)
            }
            return true
        }
        return false
    }

    fun getAnagrams(word: String): List<String> {
        val sortedWord = word.toCharArray().sorted().joinToString("")
        return anagramMap[sortedWord]?.filter { it != word } ?: emptyList()
    }

    private fun cleanAndSort(input: String): String {
        val cleaned = input.replace("\\s".toRegex(), "").lowercase(Locale.getDefault())
        if (cleaned.isEmpty()) return ""
        return cleaned.toCharArray().sorted().joinToString("")
    }
}