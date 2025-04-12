import java.util.Arrays;//we imported java's Arrays class because it has a static method toString() and it returns clean string
                        //Every class in Java inherits from Object (the root of all classes), and Object has a toString() method
                        //But the default implementation is for showing the memory address.

public class Main {
    public static void main(String[] args) {
        // ===== Test Case for TwoSum =====
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums, target);
        System.out.println("TwoSum Result: " + Arrays.toString(result));//converts the array into a readable string rather than its memory address

        // ===== Test Case for PalindromeNumber =====
        int x = 10;
        boolean resultPalindrome = PalindromeNumber.isPalindrome(x); //isPalindrome is a public static method of PalindromeNumber class 
        System.out.println(resultPalindrome);                        //PalindromeNumber is public class, and we didnt import its package because they are already in the same folder
        
        // ===== Test Case for RomanToInteger =====
        String s = "VIII";
        int resultRomanToInteger = RomanToInteger.romanToInteger(s); 
        System.out.println(resultRomanToInteger);          
        
        // ===== Test Case for LongestCommonPrefix =====
        String[] strs = {"flower","flow","flight"};
        String resultLongestCommonPrefix = LongestCommonPrefix.longestCommonPrefix(strs); 
        System.out.println(resultLongestCommonPrefix);  

        // ===== Test Case for ValidParantheses =====
        String str = "()[]{}";
        boolean resultValidParantheses = ValidParantheses.validParantheses(str);
        System.out.println(resultValidParantheses);

        // ==== First test for Dummy version ====
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode resultWithDummy = MergeTwoSortedListsWithDummy.mergeTwoLists(list1, list2);
        System.out.print("Merged (With Dummy): ");
        printList(resultWithDummy);

        // ==== Second test for No-Dummy version (fresh lists) ====
        ListNode list3 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list4 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode resultNoDummy = MergeTwoSortedListsNoDummy.mergeTwoLists(list3, list4);
        System.out.print("Merged (No Dummy): ");
        printList(resultNoDummy);

        // ===== Test Case for RemoveDuplicatesFromSortedArray =====
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums1); // call your method

        System.out.println("Unique count (k): " + k);

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println(); // line break

        // ===== Test Case for RemoveElement =====
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        
        int k2 = RemoveElement.removeElement(nums2, val);
        System.out.println("Remaining count (k): " + k2);
        System.out.print("Modified array: ");
            for (int i = 0; i < k; i++) {
                System.out.print(nums2[i] + " ");
            }
        System.out.println(); // new line

        // ===== Test Case for FirstOccurrenceNeedleHaystack =====
        String haystack = "sadbutsad";
        String needle = "sad";

        int index = FirstOccurrenceNeedleHaystack.firstOccurrenceNeedleHaystack(needle, haystack);

        System.out.println("Index of first occurrence: " + index); // Expected output: 0


        // Test Case for SearchIndexPosition 

        int [] nums3 = {1, 3, 5, 6, 8, 10, 13, 15, 18, 20};
        int target3 = 0;

        int index3 = SearchInsertPosition.searchInsertPosition(nums3, target3);
        System.out.println(index3);

        // ===== Test Case for LengthOfLastWord =====
        String input1 = "   fly me   to   the moon  ";
        int result1 = LengthOfLastWord.lengthOfLastWord(input1);
        System.out.println("Result 1: " + result1);  // Expected: 4

    }

    // Helper method to print the merged list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
