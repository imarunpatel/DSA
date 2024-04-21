package leetcode;

public class MergeSortedListRecursive {
    Node head;

    MergeSortedListRecursive() {
        this.head = null;
    }

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null) {
            current  = current.next;
        }
        current.next = newNode;
    }

    static void display(Node currentHead) {
        Node current = currentHead;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    static Node mergeTwoList(Node list1, Node list2) {
        if(list1 == null) {
            return list2;
        }

        if(list2 == null) {
            return list1;
        }

        if(list1.data < list2.data) {
            list1.next = mergeTwoList(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoList(list1, list2.next);
            return list2;
        }
    }


    public  static void main(String[] args) {
        MergeSortedListRecursive list1 = new MergeSortedListRecursive();
        MergeSortedListRecursive list2 = new MergeSortedListRecursive();

        list1.insert(0);
        list1.insert(3);
        list1.insert(5);
        list1.insert(56);

        list2.insert(3);
        list2.insert(4);
        list2.insert(5);
        list2.insert(7);

        Node merged = mergeTwoList(list1.head, list2.head);

        display(merged);

    }

}
