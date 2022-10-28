package Linklist;

public class RemoveNthNodeFromEndofList19 {
    // my approach
    // using dummyhead would be better;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;


        for (int i = n; i > 0; i--) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = fast;
        return head;
    }
}
