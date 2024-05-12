package leetcode;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoNumber {

    static void display(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        int num1 = 0;
        int num2 = 0;

        Node current = head1;
        while(current != null) {
            num1 = num1 * 10 + current.data;
            current = current.next;
        }

        Node current2 = head2;
        while(current2 != null) {
            num2 = num2 * 10 + current2.data;
            current2 = current2.next;
        }


        int reversedNum1 = Integer.parseInt(new StringBuilder(Integer.toString(num1)).reverse().toString());
        int reversedNum2 = Integer.parseInt(new StringBuilder(Integer.toString(num2)).reverse().toString());
        System.out.println(reversedNum1);
        System.out.println(reversedNum2);

        int newNumber = reversedNum2 * reversedNum1;

        System.out.println(newNumber);

    }
}
