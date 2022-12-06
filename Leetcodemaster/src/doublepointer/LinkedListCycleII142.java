package doublepointer;

public class LinkedListCycleII142 {
    // 双指针
    // 一快一慢 快是慢的两倍速度
    // 如果快指针可以追上慢指针 说明是环形链表
    // 如何确定位置？ [快慢相遇位置每前进位置1 head每前进位置1 两者相遇位置皆为环入口]

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode index1 = slow;
                ListNode index2 = head;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }

                return index1;
            }

        }
        return null;
    }
}
