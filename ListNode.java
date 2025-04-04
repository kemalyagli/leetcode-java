public class ListNode {  // this is a class for simulating manual linked list. Used for interviews or understanding the logic of linked lists.
    int val;
    ListNode next;       //“How can we use an instance variable typed ListNode inside the ListNode class?” Because Java allows a class to reference itself 
                         //— this is a key feature of how recursive data structures like linked lists, trees, and graphs are built.

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
