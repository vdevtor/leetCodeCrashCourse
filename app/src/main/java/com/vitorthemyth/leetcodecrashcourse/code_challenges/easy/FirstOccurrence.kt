package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy

class FirstOccurrence {

    fun strStr(haystack: String, needle: String): Int {
       if (needle.isEmpty() and haystack.isEmpty()) return 0
        if (needle.length > haystack.length) return -1
        for (i in 0..haystack.length - needle.length){
            if (haystack.substring(i,i + needle.length) == needle){
                return i
            }
        }
        return -1
    }
}


//FIND THE INDEX OF THE FIRST OCCURRENCE GIVEN TWO STRINGS
//DADA DUAS STRINGS ENCONTRAR O INDEX DA OCORRÊNCIA

