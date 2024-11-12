import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;

    public void addFirst(int value) {
        var node = new Node(value);
        if (isEmpty()) first = last = node;
        node.next = first;
        first = node;
    }

    public void addLast(int value) {
        var node = new Node(value);
        if (isEmpty()) first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            first = last = null;
            throw new NoSuchElementException();
        }
        var second = first.next;
        first.next = null;
        first = second;
        return;
    }

    public void deleteLast() {
        if (isEmpty()) {
            first = last = null;
            throw new NoSuchElementException();
        }
        var node = getPrevious(last);
        if (node == null) {
            first = last = null;
            return;
        }
        last = node;
        last.next = null;
        return;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int indexOf(int item) {
        int index = 0;
        var node = first;
        while (node != null) {
            if (node.value == item) {
                return index;
            } else {
                index++;
                node = node.next;
            }
        }
        return -1;
    }

    public void printAll() {
        var node = first;
        if (first == last) {
            System.out.println(first.value);
            return;
        }
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public Object peek() {
        return first.value;
    }

    public ArrayList<Integer> toArray() {
        if (isEmpty()) {
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> array = new ArrayList<Integer>();
        var a = first;
        while (a.next != null) {
            array.addLast(a.value);
            a = a.next;
        }
        return array;
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
