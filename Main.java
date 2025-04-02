import java.util.Arrays;//we imported java's Arrays class because it has a static method toString() and it returns clean string
                        //Every class in Java inherits from Object (the root of all classes), and Object has a toString() method
                        //But the default implementation is for showing the memory address.

public class Main {
    public static void main(String[] args) {
        // ===== Test Case for TwoSum =====
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums, target);
        System.out.println("TwoSum Result: " + Arrays.toString(result));//converts the array into a readable string rather than its memory address

        // ===== Test Case for PalindromeNumber =====
        int x = 10;
        boolean resultPalindrome = PalindromeNumber.isPalindrome(x); //isPalindrome is a public static method of PalindromeNumber class 
        System.out.println(resultPalindrome);                        //PalindromeNumber is public class, and we didnt import its package because they are already in the same folder
        
        // ===== Test Case for RomanToInteger =====
        String s = "VIII";
        int resultRomanToInteger = RomanToInteger.romanToInteger(s); 
        System.out.println(resultRomanToInteger);          
        
        // ===== Test Case for LongestCommonPrefix =====
        String[] strs = {"flower","flow","flight"};
        String resultLongestCommonPrefix = LongestCommonPrefix.longestCommonPrefix(strs); 
        System.out.println(resultLongestCommonPrefix);  

        // ===== Test Case for ValidParantheses =====
        String str = "()[]{}";
        boolean resultValidParantheses = ValidParantheses.validParantheses(str);
        System.out.println(resultValidParantheses);

    }
}
