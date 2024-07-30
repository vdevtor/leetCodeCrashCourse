package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy

class ValidParentheses {

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val matchingBrackets = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )
        for (char in s){
            if (char in matchingBrackets.values){
                stack.add(char)
            }else if (char in matchingBrackets.keys){
                if (stack.isEmpty()|| stack.removeLast()
                    != matchingBrackets[char]){
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}

