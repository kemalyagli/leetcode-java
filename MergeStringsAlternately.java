// The method called "mergeStringsAlternately" returns String
// and takes String "word1" and String "word2" as parameters

// The method will merge two given strings alternatively starting from word1.

// Questions: Should i handle the case where any input parameter is empty or null?

// Examples:
/*Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s

Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 */


 public class MergeStringsAlternately{
    public static String mergeStringsAlternately(String word1, String word2){
        String result = "";
        int iterationLength = 0;
        int additionalIterationLength = 0;
        if(word1.length() > word2.length()){
            iterationLength = word2.length();
            additionalIterationLength = word1.length(); 
            for (int i = 0; i < iterationLength; i++){
                result = result + word1.charAt(i);
                result = result + word2.charAt(i);
            } 
            for (int j = iterationLength; j < additionalIterationLength; j++){
                result = result + word1.charAt(j);
            } 
        }else{
            iterationLength = word1.length();
            additionalIterationLength = word2.length(); 
            for (int i = 0; i < iterationLength; i++){
                result = result + word1.charAt(i);
                result = result + word2.charAt(i);
            } 
            for (int j = iterationLength; j < additionalIterationLength; j++){
                result = result + word2.charAt(j);
            } 
        }
        return result;
    }
 }