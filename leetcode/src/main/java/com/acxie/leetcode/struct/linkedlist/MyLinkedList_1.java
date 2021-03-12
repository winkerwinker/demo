package com.acxie.leetcode.struct.linkedlist;

class MyLinkedList_1 {


    SinglyListNode head;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList_1() {
        head = new SinglyListNode(8);
        head.next = new SinglyListNode(9);
        head.next.next = new SinglyListNode(11);
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        SinglyListNode now = head;
        if (index == 1) {
            return head.val;
        }

        SinglyListNode temp = head.next;
        int i = 1;
        while (temp != null) {
            if (++i == index) return temp.val;
            temp = temp.next;
        }
        return -1;
    }


    public int getTail(int index) {
        SinglyListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        return node.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        SinglyListNode tobeInsert = new SinglyListNode(val);
        tobeInsert.next = head;
        head = tobeInsert;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        SinglyListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new SinglyListNode(val);

    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        SinglyListNode from = head;
        SinglyListNode now = new SinglyListNode(val);
        if (index == 0) {
            addAtHead(val);
            return;
        }


        SinglyListNode temp = head;
        int i = 0;
        while (temp != null) {
            if (++i == index) {
                from = temp;
            } else {
                temp = temp.next;
            }
        }
        if (temp == null) {
            System.out.println("找不到index");
            return;
        }


        if (from.next == null) {
            addAtTail(val);
            return;
        }
        now.next = from.next;
        from.next = now;

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index==1){
            head=head.next;
            return ;
        }

        SinglyListNode from = head;
        SinglyListNode temp = head;
        int i = 1;
        while (temp != null) {
            if (++i == index) {
                from = temp;
                break;
            } else {
                temp = temp.next;
            }
        }
        if (temp.next == null) {
            System.out.println("找不到index");
            return;
        }
        System.out.println(from.val);
        //这里的from其实相当于需要删除的节点的前一个节点
        from.next=from.next.next;


    }


    public static void main(String[] args) {
        MyLinkedList_1 obj = new MyLinkedList_1();

        obj.addAtHead(666);

        obj.deleteAtIndex(5);
        for (int i = 1; i < 8; i++) {
            int param_1 = obj.get(i);
            System.out.println(param_1);
        }

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