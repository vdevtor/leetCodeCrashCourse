package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy

class TwoSumChallenge {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (currentIndex in nums.indices) {
            nums.forEachIndexed { index, i ->
                if (currentIndex != index) {
                    if (nums[currentIndex] + i == target) return intArrayOf(currentIndex, index)
                }
            }
        }
        return intArrayOf()
    }

}