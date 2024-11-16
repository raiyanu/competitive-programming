package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        ReverseQueueExample();
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        queue.enqueue(10);
        queue.printQueue();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printQueue();
    }

    public static void ReverseQueueExample() {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i <= 50; i++) {
            queue.offer(i);
        }
        System.out.println(queue);
        System.out.println(reverseQueue(queue));
    }

    private static Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<Integer>();
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        return q;
    }
}

