import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class AnagramHelperTest {

    private val helper = AnagramHelper()

    @Test
    fun testAreAnagrams_Success() {
        val firstString = "Listen"
        val secondString = "Silent"

        val result = helper.areAnagrams(firstString, secondString)
        assertTrue(result, "Expected '$firstString' and '$secondString' to be anagrams")
    }

    @Test
    fun testAreAnagrams_Failure() {
        val firstString = "Hello"
        val secondString = "World"

        val result = helper.areAnagrams(firstString, secondString)
        assertFalse(result, "Expected '$firstString' and '$secondString' not to be anagrams")
    }

    @Test
    fun testGetAnagrams_NoAnagrams() {
        helper.areAnagrams("abc", "def")

        val anagrams = helper.getAnagrams("abc")
        assertTrue(anagrams.isEmpty(), "Expected no anagrams for 'abc'")
    }

    @Test
    fun testAreAnagrams_Miss_Match_Length() {
        val firstString = "Hello"
        val secondString = "Helllo"

        val result = helper.areAnagrams(firstString, secondString)
        assertFalse(result, "Expected '$firstString' and '$secondString' not to be anagrams")
    }

    @Test
    fun testGetAnagrams_WithAnagrams() {
        helper.areAnagrams("listen", "silent")
        helper.areAnagrams("listen", "enlist")
        helper.areAnagrams("evil", "vile")

        val anagrams = helper.getAnagrams("listen")
        assertEquals(listOf("silent", "enlist"), anagrams, "Expected 'listen' to have anagrams 'silent' and 'enlist'")
    }

    @Test
    fun testGetAnagrams_SingleWord() {
        helper.areAnagrams("word", "drow")

        val anagrams = helper.getAnagrams("word")
        assertEquals(listOf("drow"), anagrams, "Expected 'word' to have an anagram 'drow'")
    }

    @Test
    fun testAreAnagrams_EmptyStrings() {
        val firstString = ""
        val secondString = ""

        val result = helper.areAnagrams(firstString, secondString)
        assertFalse(result, "Expected empty strings not to be considered anagrams")
    }

    @Test
    fun testAreAnagrams_EmptyString() {
        val firstString = ""
        val secondString = "anything"

        val result = helper.areAnagrams(firstString, secondString)
        assertFalse(result, "Single empty strings not to be considered anagrams")
    }

    @Test
    fun testAreAnagrams__long_Success() {
        val firstString = "Listen to the echo of the silent wind as it whispers secrets of the old oak tree, standing tall and resolute against the test of time, its roots deep in the fertile earth, nourishing its branches that reach up to the heavens, touching the sky with a gentle caress, as if trying to grasp the fleeting clouds that drift lazily across the azure expanse, carrying with them the hopes and dreams of those who look up in wonder, captivated by the beauty of the world around them, unaware of the ancient stories that the wind carries, tales of love, loss, and the passage of time.\n"
        val secondString = "Enlist to the echo of the silent wind as it whispers secrets of the old oak tree, standing tall and resolute against the test of time, its roots deep in the fertile earth, nourishing its branches that reach up to the heavens, touching the sky with a gentle caress, as if trying to grasp the fleeting clouds that drift lazily across the azure expanse, carrying with them the hopes and dreams of those who look up in wonder, captivated by the beauty of the world around them, unaware of the ancient stories that the wind carries, tales of love, loss, and the passage of time.\n"

        val result = helper.areAnagrams(firstString, secondString)
        assertTrue(result, "Expected '$firstString' and '$secondString' to be anagrams")
    }
}
