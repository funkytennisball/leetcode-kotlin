package leet.l2

import leet.ds.ListNode
import org.junit.Test
import org.junit.Assert.*
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    private fun lnToString(node: ListNode?) : String {
        val sb = StringBuilder()
        var ins = node

        while(ins != null) {
            sb.append(ins?.`val`)
            ins = ins?.next

            if(ins != null) {
                sb.append(" -> ")
            }
        }

        return sb.toString()
    }

    @Test
    fun test1() {
        var left = ListNode(2)
        left.next = ListNode(4)
        left.next?.next = ListNode(3)

        var right = ListNode(5)
        right.next = ListNode(6)
        right.next?.next = ListNode(4)

        assertEquals("7 -> 0 -> 8", lnToString(solution.addTwoNumbers(left, right)))
    }

    @Test
    fun test2() {
        var left = ListNode(5)
        var right = ListNode(5)

        assertEquals("0 -> 1", lnToString(solution.addTwoNumbers(left, right)))
    }
}