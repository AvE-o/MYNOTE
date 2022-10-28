package Linklist;

public class IntsersectionofTwoLinkedLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 让指针移动到两个list 相同的位置
        // 先求出两个list长度
        ListNode currA = headA;
        ListNode currB = headB;
        int curA = 0;
        int curB = 0;

        while (currA != null) {
            curA++;
            currA = currA.next;
        }

        while (currB != null) {
            curB++;
            currB = currB.next;
        }

        // 这里可以只写一个判定 只需要swap 永远保持一个大即可

        currA = headA;
        currB = headB;
        if (curA > curB) {
            ListNode temp = currA;
            currA = currB;
            currB = temp;

            int tempint = curA;
            curA = curB;
            curB = tempint;
        }

        // at thit point we can make sure that currB is the longer one

        int gap = curB - curA;
        for (int i = 0; i < gap; i++) {
            currB = currB.next;
        }

        while (currB != null) {
            if (currB == currA) {
                return currB;
            }
            currA = currA.next;
            currB = currB.next;

        }
        return null;

    }
}
