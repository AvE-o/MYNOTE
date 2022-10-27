package Linklist;

public class SwapNodesinPairs24 {
    // my approach (incorrect)
    public ListNode swapPairs(ListNode head) {
        ListNode i = head;
        ListNode j = head.next;

        while (j != null) {
            ListNode temp = j;
            j.next = i;
            i.next = temp.next;
            i = i.next;
            j = j.next.next.next;

        }
        return head;
    }
}

// correct solution using dummyhead
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode prev = dummyhead;

        while (prev.next != null && prev.next.next != null) {
            ListNode temp = head.next.next;
            prev.next = head.next;
            head.next.next = head;
            head.next = temp;
            prev = head;
            head = head.next;
        }
        return dummyhead.next;

    }
}