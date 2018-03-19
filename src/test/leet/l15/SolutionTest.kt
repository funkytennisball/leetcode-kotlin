package leet.l15

import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun threeSumTest() {
        var result = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))

        assert(result[0].toIntArray() contentEquals intArrayOf(-1, 0, 1))
        assert(result[1].toIntArray() contentEquals intArrayOf(-1, -1, 2))

        assertEquals(2, result.size)
    }
}