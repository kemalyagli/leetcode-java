// A method called "kidsWithCandies" that returns a boolean array "result"
//and takes integer array "candies" and integer "extraCandies" as parameters

//The method will return a boolean array that says if particular kid has the greatest amount of candies if the kid takes extra candies.

//Questions: 

//Examples: 
/*
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false] 

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
 */

public class KidsWithCandies{
    public static boolean [] kidsWithCandies(int [] candies, int extraCandies){
        boolean [] result = new boolean[candies.length];
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++){
            if (candies[i] >= maxCandies){
                maxCandies = candies[i];
            }   
        }
        for (int i = 0; i < candies.length; i++){
            if ((candies[i] + extraCandies) >= maxCandies){
                result[i] = true;
            }
        }
        return result;
    }
}