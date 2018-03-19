package leet.l3

import org.junit.Test
import org.junit.Assert.*

class SolutionTest {
    private val solution = Solution()

    @Test
    public fun lengthOfLongestSubstringTest() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1,  solution.lengthOfLongestSubstring("bbbbbbbbbb"))
        assertEquals(3,  solution.lengthOfLongestSubstring("pwwkew"))
        assertEquals(3,  solution.lengthOfLongestSubstring("abca"))
    }
}
