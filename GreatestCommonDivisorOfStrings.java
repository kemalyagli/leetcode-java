// The method called "greatestCommonDivisiorOfStrings" returns String
// and takes "str1" and "str2" as parameters

// The method will return the largest string x such that x divides both str1 and str2

// Questions: 
// Should i handle the case where str1 or/and str2 are null? No
// Should it be case sensitive? No, because string parameters will be uppercase.

// Examples: 
/*Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */

public class GreatestCommonDivisorOfStrings{
    public static String greatestCommonDivisorOfStrings(String str1, String str2){
        String x = "";     
        if ((str1 + str2).equals(str2 + str1)){
            return str1.substring(0, gcd(str1.length(), str2.length()));
        }else{
            return x;
        }
    }

    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}