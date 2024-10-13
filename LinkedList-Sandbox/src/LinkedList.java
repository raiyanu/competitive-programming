import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(int value) {
        var node = new Node(value);
        if (first == null) first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int value) {
        var node = new Node(value);
        if (first == null) first = last = node;
        node.next = first;
        first = node;
    }

    public void deleteFirst() {
        if ( isEmpty()) {
            first = last = null;
            throw new NoSuchElementException();
        }
        var second = first.next;
        first.next = null;
        first = second;
        return;
    }

    public boolean isEmpty() {
        return first == null || first == last ;
    }

    public Object deleteLast() {
        var node = first;
        while (node.next != null) {
            if (node.next == last) {
                break;
            }
            node = node.next;
        };
        node.next = node.next.next;
        last = node.next;
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
        while (node != null) {
            System.out.print(" " + node.value);
            node = node.next;
        }
        System.out.println();
    }

    public Object peek() {
        return first.value;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
