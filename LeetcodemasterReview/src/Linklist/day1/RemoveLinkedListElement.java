package Linklist.day1;

public class RemoveLinkedListElement {
}

class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
        // 用dummyhead 因为可能会需要移除head的情况;

        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = head;
        ListNode prev = dummy;

        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }

        return dummy.next;
    }
}