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

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger{
    public static int romanToInteger(String s){
        int result = 0;
        //Store symbol and value pair
        Map<Character, Integer> romanMap = new HashMap<>(); // Map = interface, HashMap = fast hashing-based implementation
        romanMap.put('I', 1);   //Java autoboxes int (primitive) to Integer (wrapper) when storing in Map, Java unboxes Integer (wrapper) to int (primitive) when reading from Map
        romanMap.put('V', 5);   //Map is an interface (like a blueprint for maps)
        romanMap.put('X', 10);  //HashMap is a class (an actual implementation of a map)
        romanMap.put('L', 50);  //new HashMap<>() creates an object of type HashMap
        romanMap.put('C', 100); //romanMap is a reference variable that points to that object
        romanMap.put('D', 500); //<Character, Integer> wrapper classes are an object version of a primitive — it “wraps” a primitive in a class so it can be treated like an object.
        romanMap.put('M', 1000);//Java’s collection framework (Map, List, Set, etc.) is object-oriented. It works with objects, not primitives.
        //Loop through "s"
        //If the current number higher than or equal to next number add their value
        //else subtract 

        for (int i = 0; i < s.length(); i++) {
            int currentNumber = romanMap.get(s.charAt(i));

            if (i < s.length() - 1) {
                int nextNumber = romanMap.get(s.charAt(i + 1));
                if (currentNumber >= nextNumber) {
                    result = result + currentNumber;
                } else {
                    result = result - currentNumber;
                }
            } else {
                result = result + currentNumber; // Last digit always added
            }
        }

        return result;
    }
}