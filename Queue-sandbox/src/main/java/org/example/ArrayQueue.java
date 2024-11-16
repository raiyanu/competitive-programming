package org.example;

public class ArrayQueue {
    private int[] queue;
    private int front, rear, count;

    public ArrayQueue(int size) {
        queue = new int[size];
    }

    public void enqueue(int item) {
        if (count == queue.length) throw new IllegalStateException("ArrayQueue is full");
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        count++;
    }

    public int dequeue() {
        int item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return item;
    }

    public void printQueue() {
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i] + "\t");
        }
        System.out.println();
    }
}

