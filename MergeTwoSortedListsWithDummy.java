// ✅ Version 1: Using Dummy Node (Step-by-step explained)
public class MergeTwoSortedListsWithDummy {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Step 1: Create a dummy node to simplify head handling
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy; // Pointer to build the result list

        // Step 2: Traverse both lists and build the merged list
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Step 3: Attach any remaining nodes
        current.next = (list1 != null) ? list1 : list2;

        // Step 4: Return the head of the merged list (skipping dummy)
        return dummy.next;
    }
}