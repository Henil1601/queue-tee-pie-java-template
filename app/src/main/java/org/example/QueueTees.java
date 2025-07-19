package org.example;

public class QueueTees {
    private final Cutie[] queue;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    public QueueTees() {
        capacity = 10;
        queue = new Cutie[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Cutie cutie) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = cutie;
        size++;
    }

    public Cutie dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        Cutie item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int size() {
        return size;
    }
}
