package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy

class LastWordLength {

    fun lengthOfLastWord(s: String): Int {
        var found = false
        var length = 0
        for (i in s.length -1 downTo 0){
            if (s[i] != ' '){
                length++
                found = true
            }else if (found) break
        }
        return length
    }
}

