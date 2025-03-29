//Method called "romanToInteger" returns integer,
//and takes String "s" as parameter

//The method will return integer version of Roman numeral 

//Questions:
//Should i handle the situation where "s" is having some symbols different than seven different symbols?

/* 
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/

/*Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

public class RomanToInteger{
    public static int romanToInteger(String s){
        int result = 0;

        //Store symbol and value pair
        Map<Character, Integer> romanMap = new HashMap<>(); // Map = interface, HashMap = fast hashing-based implementation
        romanMap.put('I', 1); // Java autoboxes int (primitive) to Integer (wrapper) when storing in Map, Java unboxes Integer (wrapper) to int (primitive) when reading from Map
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        //Loop through "s"
        //If the current number higher than or equal to next number add their value
        //else subtract 

        return result;
    }
}