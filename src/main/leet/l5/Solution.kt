package leet.l5

class Solution {
    fun longestPalindrome(s: String): String {
        if(s.length == 0) {
            return ""
        }

        return longestPalindromeN2(s)
    }

    fun longestPalindromeN3(s: String): String {
        val charArray = s.toCharArray();

        var maxLength = 0
        var longest : String = charArray[0].toString()

        for(i in charArray.indices) {
            for(j in i + 1 until charArray.size) {
                if(isPalindrome(charArray, i, j)) {
                    val curLength = j - i + 1
                    if (curLength > maxLength) {
                        maxLength = curLength
                        longest = s.substring(i, j+1)
                    }
                }
            }
        }

        return longest
    }

    fun isPalindrome(charArray: CharArray, start: Int, end: Int): Boolean {
        var left = start
        var right = end
        while(left < right) {
            if(charArray[left] != charArray[right]) {
                return false
            }
            left ++
            right --
        }

        return true
    }

    fun longestPalindromeN2(s: String) : String{
        val charArray = s.toCharArray();

        var maxLength = 0
        var longest : String = charArray[0].toString()

        var map = HashMap<Int, HashMap<Int, Boolean>>()

        for(i in charArray.indices) {
            val hmap = HashMap<Int, Boolean>()
            hmap[i] = true
            map[i] = hmap
        }

        for((i, letter) in charArray.withIndex()) {
            for(j in i + 1 until charArray.size) {
                if(isPalindromeN2(i, letter, j, charArray, map)) {
                    map[i]!![j] = true

                    val curLength = j - i + 1
                    if (curLength > maxLength) {
                        maxLength = curLength
                        longest = s.substring(i, j + 1)
                    }
                }
            }
        }

        return longest
    }

    fun isPalindromeN2(i: Int, letter: Char, j: Int, charArray: CharArray, map: HashMap<Int, HashMap<Int, Boolean>>) : Boolean {
        val inspectedLetter = charArray[j]
        if(inspectedLetter == letter) {
            if(j-i<2) {
                return true
            } else {
                return map[j-1]!![i+1]!!
            }
        }
        return false
    }
}