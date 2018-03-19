package leet.l14

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.size == 0) {
            return ""
        }

        val retString = StringBuilder()
        for((index, letter) in strs[0].toCharArray().withIndex()) {
            var isMatch = true
            for(i in 1 until strs.size) {
                if(strs[i].length <= index || strs[i].get(index) != letter) {
                    isMatch = false
                    break
                }
            }
            if(isMatch) {
                retString.append(letter)
            } else {
                break
            }
        }

        return retString.toString()
    }
}
