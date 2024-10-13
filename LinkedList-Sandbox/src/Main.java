public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        linkedList.deleteFirst();
//        System.out.println("removed first in new linklist: ");
        linkedList.printAll();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addFirst(0);
        linkedList.addLast(5);
        linkedList.printAll();
        System.out.println("Printing first element: " + linkedList.peek());
        linkedList.deleteFirst();
        System.out.println("Removed first element");
        linkedList.printAll();
        System.out.println("Removed last element:" + linkedList.deleteLast());
        linkedList.printAll();
        System.out.println("Removed last element:" + linkedList.deleteLast());
        linkedList.printAll();
        System.out.println("Printing first element: " + linkedList.peek());
        System.out.println(linkedList.contains(1));
        System.out.println(linkedList.indexOf(33));
        System.out.println(linkedList.indexOf(33));
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