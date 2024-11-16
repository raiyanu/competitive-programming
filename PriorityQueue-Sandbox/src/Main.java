public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        while (!pq.isEmpty())
            System.out.print(pq.remove() + "\t");
        System.out.println();
        System.out.println(pq);
    }
}
