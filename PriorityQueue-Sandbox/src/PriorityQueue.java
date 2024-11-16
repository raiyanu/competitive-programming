public class PriorityQueue {
    int[] queue;
    int size;
    int capacity;

    PriorityQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
    }

    public void add(int value) {
        if (isFull()) {
            throw new IllegalStateException("Priority Queue is full");
        }
        queue[shiftItemTo(value)] = value;
        size++;
    }

    private int shiftItemTo(int value) {
        int i;
        for (i = size - 1; i >= 0; i--)
            if (queue[i] > value) {
                queue[i + 1] = queue[i];
            } else {
                break;
            }
        return i + 1;
    }

    public int remove() {
        if (isEmpty()) throw new IllegalStateException();
        return queue[--size];
    }

    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i <= queue.length - 2; i++) {
            str.append(queue[i]).append(", ");
        }
        str.append(queue[queue.length - 1]).append("]");
        return str.toString();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == capacity;
    }
}
