package leet.l7

class Solution {
    fun reverse(x: Int): Int {
        var number: Long = Math.abs(x).toLong()
        var res: Long = 0

        while(number > 0) {
            res = res * 10 + number % 10
            number /= 10
        }

        if (res > Int.MAX_VALUE) {
            return 0
        } else {
            return if (x >= 0) res.toInt() else (-1 * res.toInt())
        }
    }
}

