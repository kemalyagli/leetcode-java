//The method called "lengthOfLastWord" returns int,
//and takes String "s" as parameter.

//The method will return the length of the last word.

//Questions:
// ❓ Should I handle leading or trailing spaces? ✅ Yes
// ❓ Can there be multiple spaces between words? ✅ Yes


//Examples:

/*Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/

public class LengthOfLastWord{
    public static int lengthOfLastWord(String s){


        String trimmed = s.trim(); // Remove leading and trailing spaces
        String[] splitted = trimmed.split(" +"); // Split by one or more spaces

        return splitted[splitted.length - 1].length(); // Length of last word
    }
}


