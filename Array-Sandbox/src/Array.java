public class Array {
    private int count = 0;
    private int[] numbers;

    public Array(int size) {
        numbers = new int[size];
    }

    public int getLength() {
        return count;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
    }

    public void insert(int item) {
        if (count == numbers.length) {
            int[] newNum = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newNum[i] = numbers[i];
            }
            newNum[count++] = item;
            numbers = newNum;
        } else {
            numbers[count++] = item;
        }
    }

    public void removeAt(int index) {
        if (index >= numbers.length) return;
        int[] newNum = new int[numbers.length - 1];
        int anchor = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (!(i == index)) {
                newNum[anchor++] = numbers[i];
            }
        }
        numbers = newNum;
        count--;
    }

    public int indexOf(int num) {
        for (int i = 0; i <= numbers.length; i++) {
            if (num == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public Object getItem(int index) {
        if (index > numbers.length) {
            return null;
        } else {
            return numbers[index];
        }
    }
}
