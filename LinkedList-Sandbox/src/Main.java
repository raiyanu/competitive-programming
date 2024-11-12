public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        linkedList.deleteFirst();
//        System.out.println("removed first in new linklist: ");
        linkedList.addFirst(0);
        linkedList.printAll();
        linkedList.addLast(1);
        linkedList.printAll();
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(9);
        linkedList.addLast(8);
        linkedList.addLast(7);
        linkedList.printAll();
        System.out.println("- Printing first element: " + linkedList.peek());
        linkedList.deleteFirst();
        System.out.println("- Removed first element");
        linkedList.printAll();
        System.out.println("- Removed last element");  linkedList.deleteLast();
        linkedList.printAll();
        System.out.println("- Removed last element");  linkedList.deleteLast();
        linkedList.printAll();
        System.out.println("Printing first element: " + linkedList.peek());
        System.out.println(linkedList.contains(1));
        System.out.println(linkedList.indexOf(33));
        System.out.println(linkedList.toArray().toString());;
    }
}

//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(30);
//        list.addLast(20);
//        list.addFirst(40);
//        System.out.println(list.contains(20));
//        System.out.println(list.indexOf(20));
//        System.out.println(list.size());
//        var arrList = list.toArray();
//        System.out.println(Arrays.toString(arrList));
//        System.out.println(list);
