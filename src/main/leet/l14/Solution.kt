package leet.l14

class Solution {
    /**
     * 1 - I | 5 - V | 10 - X | 50 - L | 100 - C | 500 - D | 1000 - M
     */
    fun intToRoman(num: Int): String {
        val romans = HashMap<Int, String>()
        romans[1] = "I"
        romans[5] = "V"
        romans[10] = "X"
        romans[50] = "L"
        romans[100] = "C"
        romans[500] = "D"
        romans[1000] = "M"

        var numItr = num
        var digitsItr = 1
        var roman = ""

        while(numItr > 0) {
            val digit = numItr % 10
            var append = ""

            if(digit >= 1 && digit <=3) {
                append = romans[digitsItr]!!.repeat(digit)
            } else if (digit == 4) {
                append = romans[digitsItr]!! + romans[digitsItr * 5]!!
            } else if (digit == 5) {
                append = romans[digitsItr * 5]!!
            } else if (digit >= 6 && digit <=8) {
                append = romans[digitsItr * 5]!! + romans[digitsItr]!!.repeat(digit-5)
            } else if (digit == 9) {
                append = romans[digitsItr]!! + romans[digitsItr * 10]
            }

            roman = append + roman
            digitsItr *= 10
            numItr /= 10
        }

        return roman
    }
}
