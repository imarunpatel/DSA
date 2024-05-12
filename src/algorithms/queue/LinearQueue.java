package algorithms.queue;

import java.util.Arrays;

public class LinearQueue<T> {
    private Object[] array;
    private int front; // Index of the front element
    private int rear;  // Index of the rear element
    private int size;  // Current size of the queue
    private int capacity; // Maximum capacity of the queue

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear++;
        array[rear % capacity] = item;
        size++;
    }

    public T dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T item = (T) array[front % capacity];
        front++;
        size--;
        return item;
    }

    public T peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) array[front % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public static void main(String[] arg) {
        LinearQueue<Integer> queue = new LinearQueue<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + Arrays.toString(queue.array));

        while(!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
