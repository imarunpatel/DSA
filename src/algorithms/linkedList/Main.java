package algorithms.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(0);
        list.insert(9);
        list.insert(4);
        list.insert(5);
        list.reverse();
        list.display();
    }
}
