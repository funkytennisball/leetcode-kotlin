package leet.l13

import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun romanToIntTest() {
        assertEquals(1, solution.romanToInt("I"))
        assertEquals(2, solution.romanToInt("II"))
        assertEquals(4, solution.romanToInt("IV"))
        assertEquals(988, solution.romanToInt("CMLXXXVIII"))
    }
}