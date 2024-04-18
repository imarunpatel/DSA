package algorithms.linkedList;


class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void length(Node current, int count) {
        if(current == null) {
            System.out.println(count);
            return;
        }
        length(current.next, count+1);
    }

    void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

//    Reverse a liked list

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    void display() {
        Node current = head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
};
