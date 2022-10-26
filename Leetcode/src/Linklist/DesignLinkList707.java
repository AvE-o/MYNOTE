package Linklist;

// My linklist define has some problem in it;
// Singly linked list
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
}
class MyLinkedList {
    // size of the linklist
    int size;
    // 虚拟头节点
    ListNode head;

    // initilized the linklist
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    // get the value of the index node
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode currentNode = head;
        // this goes one beyond the index cause we have a virtual head
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next; // goes one more
        }
        return currentNode.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);

    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        size++;
        ListNode prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = prev.next;
        prev.next = toAdd;

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size) {
            return;
        }
        size--;
        if (index == 0) {
            head = head.next;
        }
        ListNode prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
