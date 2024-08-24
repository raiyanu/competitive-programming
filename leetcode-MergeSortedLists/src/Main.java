public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);
        ListNode list3 = new ListNode(2);
        ListNode list4 = new ListNode(3);
        ListNode list5 = new ListNode(4);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        ListNode lista1 = new ListNode(1);
        ListNode lista2 = new ListNode(2);
        ListNode lista3 = new ListNode(2);
        ListNode lista4 = new ListNode(3);
        ListNode lista5 = new ListNode(4);
        ListNode lista6 = new ListNode(5);
        lista1.next = lista2;
        lista2.next = lista3;
        lista3.next = lista4;
        lista4.next = lista5;
        lista5.next = lista6;
        ListNode current = sol.mergeTwoLists(list1, lista1);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1.next != null || list2.next != null) return list1;
        ListNode currrent1 = new ListNode(list1.val);
        ListNode currrent2 = new ListNode(list2.val);
        while (list1.next == null && list2.next == null) {
            if (list1.next != null) {
                if (list1.val > list2.val) {
                    System.out.println(list1.val);
                    currrent1 = list1.next;
                } else {
                    System.out.println(list2.val);
                    currrent2 = list2.next;
                }
            } else {

            }
        } return list1;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}