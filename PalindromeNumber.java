//Method called "isPalindrome" returns boolean,
//takes integer "x" as parameter

//The method will return true or false if "x" is palindrome or not.

//Questions:
//Should i handle the negative numbers?
//Should single-digit numbers be considered palindromes?

//Input: x = 121
//Output: true

public class PalindromeNumber{
    public static boolean isPalindrome(int x){
        
        //Convert "x" to String
        String str = String.valueOf(x);
        String y = "";
        //Loop through the elements of String
        //If the index of the element 0->2 which is length-index-1
        //                            1->1 which is length-index-1
        //                            2->0 which is length-index-1
        //Call the new number as "y"
        for(int i = 0; i < str.length(); i++){
            y = y + str.charAt(str.length()-i-1);         //can not use str[i] = str[str.length()-i-1]; at java it is c syntax
        }                                                 //In Java, String is an immutable object from a class,
                                                          //not a simple collection of characters like in other languages.
                                                          //You use methods to interact with it — not operators like [].
                                                          //can not use str.charAt(i) = str.charAt(str.length()-i-1); either since str is immutable
                                                          //it’s not a variable you can assign to — it’s a return value from a method
                                                          //Even though you can’t mutate a String, Java allows this syntactic sugar for concatenation and it creates new string
                                                          //After first creation of the string (String y = "";) we can assign it a new y = "a"; 
                                                          //because we are just changing the reference, not the content of the string
                                                          //“I want y to now point to the string "a" instead of the string "".”

        //Check if "str" is equal to "y"
        boolean result = str.equals(y);
        //return true if they are equal, otwerwise return false                              
 
        return result;
    }
}
