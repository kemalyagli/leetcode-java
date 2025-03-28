public class TwoSum { 

    public static int[] twoSum(int[] nums, int target) {//when the compiler sees a static method, it binds it early to the class — not dynamically at runtime like instance methods.
        int[] result = new int[2];                      //static means the method belongs to the class, not to any instance. It’s loaded once and shared, and it’s used for utility-style methods that don’t need object state.
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

}