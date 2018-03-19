package leet.l3


class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.length == 0) {
            return 0
        }

        var longestLength = 1

        var ptrLeft = 0
        var ptrRight = 1

        val set = hashSetOf<Char>()
        val charArray = s.toCharArray()

        set.add(charArray[0])

        var currentLength = 2

        while(ptrRight != s.length) {
            while(set.contains(charArray[ptrRight])) {
                set.remove(charArray[ptrLeft])
                ptrLeft++
                currentLength--
            }
            set.add(charArray[ptrRight])
            longestLength = if(currentLength > longestLength) currentLength else longestLength

            ptrRight++
            currentLength++
        }

        return longestLength
    }
}
