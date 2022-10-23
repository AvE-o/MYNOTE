package Linklist;

public class ReorderList143 {
    public void reorderList(ListNode head) {
        if (head == null
                || head.next == null
                || head.next.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        // 找到中间结点
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode second = slow.next;
        // 注意置空，分为两个链表
        // 第一个链表的长度大于（+1）等于第二个链表长度
        slow.next = null;
        // 反转后半链表
        second = reverseList(second);

        ListNode first = head;
        // 合并两个链表，画图模拟
        // 把第二个链表插在第一个链表中
        while (second != null) {
            // 暂存第一个后续结点
            ListNode next = first.next;
            first.next = second;
            second = second.next;
            first = first.next;
            first.next = next;
            first = first.next;
        }

    }


    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    /** My code with problem

     // step1 split into two part
     // step2 revers the second part of the List
     // step3 merge the first part and the reverse second part

     ListNode fast = head;
     ListNode slow = head;


     // split
     while (fast.next != null && fast.next.next != null) {
     fast = fast.next.next;
     slow = slow.next;
     }

     ListNode second = slow.next;


     ListNode Rsecond = reverseList(second);
     // reverse
     ListNode first = head;

     while (second != null) {
     ListNode next = first.next;
     first.next = second;
     second = second.next;
     first = first.next;
     first.next = next;
     first = first.next;

     }
     }
     private ListNode reverseList(ListNode head) {
     ListNode prev = null;
     ListNode next = null;
     while (head != null) {
     next = head.next;
     head.next = prev;
     prev = head;
     head = next;
     }
     return prev; // prev now is the reverse list
     }
     **/
}
