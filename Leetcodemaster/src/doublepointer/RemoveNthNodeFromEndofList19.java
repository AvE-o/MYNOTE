package doublepointer;

public class RemoveNthNodeFromEndofList19 {
    // double pointer
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 原理是利用好两个指针 先将j指针移动到距离初始位置n + 1距离的node
        // 然后移动j指针直到结尾处 此时i指针位置就是要移除的node 的前一位置[方便删除]

        ListNode i = head;
        ListNode j = head;

        for (int k = 0; k < n; k++) {
            j = j.next;
        }

        if (j == null) return head.next;

        while (j.next != null) {
            j = j.next;
            i = i.next;
        }

        i.next = i.next.next;

        return head;
    }
}
