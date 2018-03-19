package leet.l13

import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun threeSumTest() {
        assertEquals("I", solution.intToRoman(1))
        assertEquals("III", solution.intToRoman(3))
        assertEquals("IV", solution.intToRoman(4))
        assertEquals("VII", solution.intToRoman(7))
        assertEquals("CMLXXXVIII", solution.intToRoman(988))
    }
}