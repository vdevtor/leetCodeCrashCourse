package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy


//[I, V, X, L,  C,  D,  M] ROMAN NUMBERS
//[1, 5, 10,50,100,500,1000] VALUES

//INPUT = MCMXCIV -- EXPECTED RESULT = 1994

class RomanToInteger {

    fun romanToInt(s: String): Int {
        val romanNumbers = hashMapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000,
        )
        var result = 0
        var prevResult = 0

        s.forEach { c ->
            val value = romanNumbers[c] ?: 0
            result += if (value > prevResult) {
                value - 2 * prevResult
            } else value
            prevResult = value
        }

        return result
    }

}