// The method called "searchIndexPosition" returns int
//and takes array of integers "nums" and integer "target" as parameters.

//The method will return the index of the target, or desired index of the target. And it must be with O(log n) runtime complexity.

//Questions: ?
// ❓ Can the target be smaller than the smallest element? ✅ Yes
// ❓ Can the target be greater than the largest element? ✅ Yes

// Examples: 

/*Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
*/

public class SearchInsertPosition {
    public static int searchInsertPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // Right should be the last valid index

        while (left <= right) {
            // Safer mid calculation to avoid integer overflow when left + right is too large
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (target < nums[mid]) {
                right = mid - 1;  // Eliminate mid since it's already checked
            } else {
                left = mid + 1;   // Move to the right half
            }
        }

        // If target not found, left points to the correct insert index
        return left;
    }
}
