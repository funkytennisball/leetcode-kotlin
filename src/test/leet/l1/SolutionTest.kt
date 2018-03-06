package leet.l1

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun twoSumTest() {
        Assert.assertArrayEquals(solution.twoSum(intArrayOf(2,7,11,15), 9), intArrayOf(0,1))
    }
}