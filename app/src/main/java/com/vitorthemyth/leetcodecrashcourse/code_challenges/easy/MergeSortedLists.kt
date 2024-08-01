package com.vitorthemyth.leetcodecrashcourse.code_challenges.easy

class MergeSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        var merged = dummy
        var listOne = list1
        var listTwo = list2
        while(listOne != null && listTwo != null){
            if(listOne.`val` < listTwo.`val`){
                merged.next = ListNode(listOne.`val`)
                merged = merged.next!!
                listOne = listOne.next
            }
            else{
                merged.next = ListNode(listTwo.`val`)
                merged = merged.next!!
                listTwo = listTwo.next
            }
        }
        merged.next = if(listOne != null) listOne else listTwo
        return dummy.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
