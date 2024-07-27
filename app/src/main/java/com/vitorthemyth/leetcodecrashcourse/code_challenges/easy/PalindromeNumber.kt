package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy

class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var task = x
        var reversedNumber = 0
        while (task > 0) {
            reversedNumber = 10 * reversedNumber + task % 10
            task /= 10
        }
        return reversedNumber == x
    }
}


