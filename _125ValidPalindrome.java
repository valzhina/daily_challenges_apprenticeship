/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */
public class _125ValidPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

//    public static boolean isPalindrome(String s) {
//      /*Option 1*/
//        s = s.toLowerCase();
//        String s1 = "";
//        for(int i = 0; i < s.length(); i++){
//            if (Character.isLetterOrDigit(s.charAt(i))){
//                s1 += s.charAt(i);
//            }
//        }
//        int l = 0;
//        int r = s1.length() - 1;
//        while (l < r){
//            if (s1.charAt(l) == s1.charAt(r)){
//                l += 1;
//                r -= 1;
//            }
//            else{
//                return false;
//            }
//        }
//        return true;
//    }
//}

        /*Option2*/
    public static boolean isPalindrome(String s) {

        if (s.length() == 0) { //checks if the string is empty
            return true;
        }

        String s2 = s.toLowerCase();

        int r = s2.length() - 1; //calculating the index of the last letter
//        System.out.println(r);

        int l = 0;
        while (l < r){ //while left index smaller than right index
            while(l < r && !Character.isLetterOrDigit(s2.charAt(l))){ //keep checking after each l++ make sure  l < r is still valued
                l++;
            }
            while(l < r && !Character.isLetterOrDigit(s2.charAt(r))){ //keep checking after each l++ make sure  l < r is still valued
                r--;
            }
            if(s2.charAt(l) != s2.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

//removing all non-alphabetical or non-numeric values and wrigting the rest into a new string
//        String editedStr = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();

//creating new CharArray from the string above
//        char[] editedStrArr = editedStr.toCharArray();