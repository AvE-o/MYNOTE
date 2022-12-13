package Linklist.day6;

public class IntersectionofTwoLinkedLists {
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lenA = 0;
        int lenB = 0;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;

        if (lenB > lenA) {
            int temp = lenA;
            lenA = lenB;
            lenB = temp;

            ListNode tempC = tempA;
            tempA = tempB;
            tempB = tempC;
        }

        int lenC = lenA - lenB;
        for (int i = 0; i < lenC; i++) {
            tempA = tempA.next;
        }

        while (tempA != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }
}
