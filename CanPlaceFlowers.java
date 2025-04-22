// Method called "canPlaceFlowers" returns boolean,
// takes array of integers "flowerbed" and integer "n" as parameters.

// The method return true or false if we can plant flowers or not. No adjacent flowers.

//Questions:

//Examples: 
/*
Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false

 */


 public class CanPlaceFlowers{
    public static boolean canPlaceFlowers(int [] flowerbed, int n){
        int flowerCounter = 0;
            for (int i = 0; i < flowerbed.length; i++){
                if(i == 0 && flowerbed[i] == 0 && (flowerbed.length == 1 || flowerbed[i + 1] == 0)){
                    flowerCounter++;
                    flowerbed[i] = 1;
                }else if(i > 0 && i < flowerbed.length-1){
                    if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                        flowerCounter++;
                        flowerbed[i] = 1;
                    }
                }else if(i == flowerbed.length-1 && flowerbed[i] == 0 && flowerbed[i-1] == 0){
                    flowerCounter++;
                    flowerbed[i] = 1;
                }
            }
        return flowerCounter>=n;
    }
}