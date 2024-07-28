package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy

import kotlin.math.sqrt

class LongestCommonPrefix {


    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        val roleModel = strs.first()
        var commonString = ""
        for (index in roleModel.indices) {
            val currentChar = roleModel[index]
            for (str in strs) {
                if (index >= str.length || str[index] != currentChar) {
                    return commonString
                }
            }
            commonString += currentChar
        }

        return commonString
    }
}


// flower