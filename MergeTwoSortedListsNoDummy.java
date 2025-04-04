// Method called mergeTwoSortedLists returns array of integers
//and takes 2 array of integers called "list1" and "list2" as parameters

//The method will return the merged and sorted list

//Questions:
//Should i handle the case where input lists are not sorted?
//Should i handle the case where input lists are empty array or null?

//Examples:
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

//Input: list1 = [], list2 = [0]
//Output: [0]

/* 


public class MergeTwoSortedLists {
    public static int[] mergeTwoSortedLists(int[] list1, int[] list2){
        int[] result = new int[list1.length+list2.length];

        
        
        
        return result;  
    } 
}


*/

/*

🔢 Array:

Like a row of mailboxes — each one has a number, and you can jump to any one instantly.
Fast lookup by index, fixed size

🔗 Linked List:

Like a treasure map — you start at the first spot, and each gives you a clue to the next location.
Dynamic size, slower lookup, but flexible insertion/deletion

*/

// Method called "mergeTwoSortedLists" returns a ListNode
// and takes two ListNode parameters "list1" and "list2"

//The method will return the merged and sorted list

//Questions:
//Should i handle the case where input lists are not sorted? No
//Should i handle the case where input lists are empty array? Yes

//Examples:
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

//Input: list1 = [], list2 = [0]
//Output: [0]

// ❌ Version 2: Without Dummy Node (Step-by-step explained)
public class MergeTwoSortedListsNoDummy {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Step 1: Handle base cases
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Step 2: Manually choose the first node (head)
        ListNode head;
        if (list1.val < list2.val) {
            head = list1;         // head points to the smaller first node
            list1 = list1.next;   // move list1 forward
        } else {
            head = list2;         // head points to the smaller first node
            list2 = list2.next;   // move list2 forward
        }

        // Step 3: Use a current pointer to build the rest of the list
        ListNode current = head;

        // Step 4: Merge nodes while both lists have elements
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1; // link to smaller node
                list1 = list1.next;   // move that list forward
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // move the builder pointer
        }

        // Step 5: Attach the remaining nodes from list1 or list2
        current.next = (list1 != null) ? list1 : list2;

        // Step 6: Return the head of the new merged list
        return head;
    }
}
