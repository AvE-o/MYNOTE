package Linklist.day4;

public class SwapNodesinPairs {

}


class SwapNodesinPairs24 {
    public ListNode swapPairs(ListNode head) {

        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode prev = dummyhead;

        // 这里用 dummyhead 简单一点因为不用的话head 还会指向第一个数导致

        while (prev.next != null && prev.next.next != null) {
            ListNode temp = prev.next.next.next;
            prev.next = head.next;
            head.next.next = head;
            head.next = temp;
            prev = head;
            head = head.next;
        }

        return dummyhead.next;

    }
}
