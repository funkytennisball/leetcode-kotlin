package leet.l14

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun longestCommonPrefixTest() {
        assertEquals("abc", solution.longestCommonPrefix(arrayOf("abcdefgh", "abc", "abcdf")))
        assertEquals("ab", solution.longestCommonPrefix(arrayOf("abcdefgh", "abdfc", "abcdf")))
    }
}