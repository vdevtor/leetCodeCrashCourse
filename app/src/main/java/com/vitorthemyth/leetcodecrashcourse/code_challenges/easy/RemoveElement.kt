package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy

class RemoveElement {

    fun removeElement(nums: IntArray, `val`: Int): Int {
       var count = 0
        for (i in nums.indices){
            if (nums[i] != `val`){
                nums[count] = nums[i]
                count++
            }
        }
        return count
    }
}