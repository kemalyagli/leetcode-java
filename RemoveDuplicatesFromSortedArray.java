// Method called "removeDuplicates" returns an int
// and takes an array of integers "nums" as a parameter

// The method will remove duplicate values from the sorted array "in-place"
// and return the number of unique elements (k).
// The first k elements in "nums" should contain the unique elements in order.
// It doesn't matter what values remain after index k.

// Questions:
// Should I handle the case where "nums" is null or empty? ❌ No
   
//Empty arr check -> 

//empty array (int[] arr = new int[0];) or int[] arr = {}

/* 
   
if (nums.length == 0) {
    System.out.println("It's empty!");
}

*/

// Should I create a new array to store results? ❌ No, must do it in-place
// Should I return the modified array? ❌ No, just return the number k

// Examples:
// Input: nums = [1, 1, 2]
// Output: 2, with nums modified as [1, 2, _]

// Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
// Output: 5, with nums modified as [0, 1, 2, 3, 4, _, _, _, _, _]

public class RemoveDuplicatesFromSortedArray{
    public static int removeDuplicates(int[] nums){
        int writeIndex = 1; // index where next unique value will go
        int currentElement = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentElement) {
                nums[writeIndex] = nums[i];    // write unique value to the front
                writeIndex++;                  // move write position forward
                currentElement = nums[i];      // update current element
            }
        }
        return writeIndex;
    }
}

