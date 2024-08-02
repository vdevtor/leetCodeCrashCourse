package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy

class SearchInsert {


    fun searchInsert(nums: IntArray, target: Int): Int {
        var arrayLeft = 0
        var arrayRight = nums.size - 1
        while (arrayLeft < arrayRight) {
            val mid = arrayLeft + (arrayRight - arrayLeft) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] < target) {
                arrayLeft = mid + 1
            } else {
                arrayRight = mid - 1
            }
        }
        return arrayLeft
    }

    fun searchInsertAlternative(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return 0
        if (nums.size < target) {
            for (i in nums.size - 1 downTo 0) {
                if (nums[i] == target) return i
            }
        } else {
            for (i in nums.indices) {
                if (nums[i] >= target) return i
            }
        }
        return nums.size
    }
}

