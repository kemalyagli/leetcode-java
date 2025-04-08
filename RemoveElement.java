//The method called "removeElement" returns int,
//and takes array of integers "nums" and integer "val" as parameters.

//The method will remove all "val" values in "nums" in place and will return the number of elements in "nums"

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

//Example:
//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//Note that the five elements can be returned in any order.
//It does not matter what you leave beyond the returned k (hence they are underscores).


class RemoveElement{
    public static int removeElement(int[] nums, int val){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=val){
                nums[k] = nums [i];
                k++; 
            }
        }
        return k;
    }
}