package leet.l5

import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun longestPalindromeTest() {
        assertEquals("bab", solution.longestPalindrome("babada"))
        assertEquals("babab", solution.longestPalindrome("bababa"))
    }
}