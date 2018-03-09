package leet.l7

import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseTest() {
        assertEquals(1254, solution.reverse(4521))
        assertEquals(0, solution.reverse(0))
        assertEquals(5,  solution.reverse(5))
        assertEquals(21, solution.reverse(120))
        assertEquals(-154, solution.reverse(-451))
    }
}