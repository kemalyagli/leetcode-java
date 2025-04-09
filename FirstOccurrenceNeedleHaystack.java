// The method called "firstOccurrenceNeedleHaystack" returns integer
//and takes Strings "needle" and "haystack" as parameters

//the method will return the first occurrence index of needle in haystack, if it does not occur it wil return -1;

//Questions: Should it be case sensitive? No 

//Examples:

/*Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */

 public class FirstOccurrenceNeedleHaystack{
    public static int firstOccurrenceNeedleHaystack(String needle, String haystack){ //built in function return haystack.indexOf(needle); would solve the problem in one line of code.
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            if (haystack.substring(i, needle.length() + i).equals(needle)){ //equals is case sensitive, haystack.toLowerCase().substring(...) == needle.toLowerCase()
                return i;
            }
        }
        return -1;
    }
 } 