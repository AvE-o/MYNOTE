package Linklist.day5;

public class RemoveNthNodeFromEndofList {
}

// leetcode 19

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        // 将fast 移动到距离 slow n 的位置
        while (n > 0) {
            fast = fast.next;
            n--;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}