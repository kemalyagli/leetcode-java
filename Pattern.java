//Method called "twoSum" returns array of integers,
//takes array of integers "nums" and integer "target" as parameters

//The method will return the indices of two numbers that add up to "target"

//Questions:
//Should i handle the case where the "nums" is null or an empty array?
//What should i return if there is no two numbers add up to "target"?

public int[] twoSum(int[] nums, int target) {
    // We initialize an array of size 2 because the problem guarantees
    // that exactly two indices will be returned.
    //
    // In Java, we can't declare an array like int[] result = [] —
    // we must either specify the size (e.g., new int[2]) or assign values directly (e.g., new int[]{0, 1} or {0, 1}).
    //
    // This is because Java is a statically typed language (meaning I must declare the type of each variable and it stays consistent.
    // It also means Java checks type correctness at compile time, which helps avoid certain bugs early), and arrays have fixed sizes.
    // The compiler needs to know how much memory to allocate and how many default values to assign.
    //
    // Alternative options:
    // - If the result size is unknown, we could use a List<Integer> and convert it to int[] later.
    // - If we're planning logic and don't yet have the result, we could use `null` as a temporary placeholder.
    //   But returning or accessing a null array would throw a NullPointerException.
    int[] result = new int[2];

    return result;
}

public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];

    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    
    // Plan:
    // - Loop through each element
    // - Calculate complement (target - current number)
    // - Check if complement exists in map
    // - If found, return indices
    // - Otherwise, store number and index in map

    return result;
}

public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    for(int i=0; i<nums.length; i++){
        int complement = target - nums[i];
        for(int j=i+1; j<nums.length; j++){
            if(nums[j]==complement){
                result = new int[]{i,j}; //outside of the declaration, if we are assigning new values we must use new keyword.
                return result; //exit immediately for efficiency
            }
        }
    }
    return result;//function must return even though conditions are not met
}