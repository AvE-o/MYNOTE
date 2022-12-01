package doublepointer;

public class IntersectionofTwoLinkedLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0, lenB = 0;

        // 求出headA长度
        while (curA != null) {
            curA = curA.next;
            lenA++;
        }

        // 求出headB长度
        while (curB != null) {
            curB = curB.next;
            lenB++;
        }

        curA = headA;
        curB = headB;

        // 比较两者长度 确保lenA & curA 永远是长边
        if (lenB > lenA) {
            int temp = lenA;
            lenA = lenB;
            lenB = temp;

            ListNode tempN = curA;
            curA = curB;
            curB = tempN;
        }

        int gap = lenA - lenB;
        for (int i = 0; i < gap; i++) {
            curA = curA.next;
        }

        while (curA != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }

        return null;
    }
}
