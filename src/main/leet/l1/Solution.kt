package leet.l1

/**
 * https://leetcode.com/problems/two-sum/description/
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for((index, num) in nums.withIndex()) {
            if(map.containsKey(num)) {
                return intArrayOf(map.getOrDefault(num, 0), index)
            } else {
                map.put(target - num, index)
            }
        }

        return intArrayOf(0,0)
    }
}