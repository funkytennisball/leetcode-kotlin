package leet.l15

import java.util.*
import kotlin.collections.HashSet

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        return threeSumN2(nums)
    }

    fun threeSumN2(nums: IntArray): List<List<Int>> {
        val result  = ArrayList<List<Int>>()
        val numsSorted = nums
        Arrays.sort(numsSorted)

        val map = HashMap<Int, Int>()
        for((position, number) in numsSorted.withIndex()) {
            if(!map.containsKey(number)) {
                map[number] = position
            }
        }

        for(i in 0 until numsSorted.size) {
            for(j in i+1 until numsSorted.size) {
                val search = 0 - numsSorted[i] - numsSorted[j]
                if(map.containsKey(search)) {
                    val k = map[search]!!
                    if (k > j) {
                        val answer = listOf(numsSorted[i], numsSorted[j], numsSorted[k])
                        result.add(answer)
                    }
                }
            }
        }

        return result
    }
}