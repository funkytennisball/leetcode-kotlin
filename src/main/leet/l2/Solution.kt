package leet.l2

import leet.ds.ListNode

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val res = ListNode(0)

        var node: ListNode? = res
        var left = l1
        var right = l2

        var carry = 0

        while (left != null || right != null || carry > 0) {
            val leftVal = left?.`val` ?: 0
            var rightVal = right?.`val` ?: 0

            val sum = (leftVal + rightVal + carry) % 10
            carry = (leftVal + rightVal + carry) / 10

            node?.`val` = sum

            if (left?.next != null || right?.next != null || carry > 0) {
                node?.next = ListNode(0)
                node = node?.next
            }
            left = left?.next
            right = right?.next

        }
        return res
    }
}