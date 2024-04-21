package leetcode;

class ListNode {
    int data;
    ListNode next;

    ListNode() {};

    ListNode(int val) {
        this.data = val;
    }

    ListNode(int val, ListNode next) {
        this.data = val;
        this.next = next;
    }
}

class LinkedList {
    ListNode head;

    LinkedList() {
        this.head = null;
    }

    void insert(int data) {
        ListNode newNode = new ListNode(data);

        if(head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;

        while(current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    void display() {
        ListNode current = head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class MergeTwoSortedList {


    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insert(0);
        list1.insert(1);
        list1.insert(4);

        list2.insert(-1);
        list2.insert(3);
        list2.insert(9);
        list2.insert(34);
        list2.insert(56);
//        list1.display();
//        System.out.println();
//        list2.display();
        mergeTwoLists(list1.head, list2.head);
    }

    static void mergeTwoLists(ListNode list1, ListNode list2) {

        LinkedList list = new LinkedList();

        while(list1 != null && list2 != null) {
            if(list1.data <= list2.data) {
                list.insert(list1.data);
                list1 = list1.next;
            } else {
                list.insert(list2.data);
                list2 = list2.next;
            }
        }

        while(list1 != null) {
            list.insert(list1.data);
            list1 = list1.next;
        }

        while(list2 != null) {
            list.insert(list2.data);
            list2 = list2.next;
        }

        list.display();

    }


}
