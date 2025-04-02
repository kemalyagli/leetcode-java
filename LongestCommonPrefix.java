// Method called "longestCommonPrefix" returns String
//and takes array of strings "strs" as parameter

//Method will return the longest common prefix of strings.

//Questions:
// Should i handle the situation where there is no common prefix? Yes
// Should i handle the situation where strs is null or empty array? No

//Input: strs = ["flower","flow","flight"]
//Output: "fl"

//Input: strs = ["dog","racecar","car"]
//Output: ""

public class LongestCommonPrefix{
    public static String longestCommonPrefix(String[] strs){
        String result = "";
        // Set the initial prefix as the first string in the array
        String initialPrefix = strs[0];
        // Loop through the remaining strings in the array starting from index 1
        for (int i = 1; i < strs.length; i++){
            // While the current string does NOT start with the prefix
            while(!strs[i].startsWith(initialPrefix)){
                initialPrefix = initialPrefix.substring(0, initialPrefix.length()-1);// Remove the last character from the prefix using substring
                if (initialPrefix.length() == 0){
                    return result;// If prefix becomes empty, return "" immediately (no common prefix)
                }
            }
        }  
        result = initialPrefix;
        // Return the final value of prefix
        return result;
    }

}