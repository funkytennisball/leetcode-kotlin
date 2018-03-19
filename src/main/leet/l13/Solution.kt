package leet.l13

class Solution {
    /**
     * 1 - I | 5 - V | 10 - X | 50 - L | 100 - C | 500 - D | 1000 - M
     */
    fun romanToInt(s: String): Int {
        val romans = HashMap<Char, Int>()
        romans['I'] = 1
        romans['V'] = 5
        romans['X'] = 10
        romans['L'] = 50
        romans['C'] = 100
        romans['D'] = 500
        romans['M'] = 1000

        var totalValue = 0

        for((i, c ) in s.toCharArray().withIndex()) {
            var charValue = romans[c]!!

            if(i != s.length - 1 && romans[s.get(i+1)]!! > charValue) {
                charValue = -charValue
            }

            totalValue += charValue
        }

        return totalValue
    }
}
