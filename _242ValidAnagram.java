
/*
   Given two strings s and t, return true if t is an anagram of s, and false otherwise.
   An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
   typically using all the original letters exactly once.

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false
*/

import java.util.Arrays;
import java.util.HashMap;

public class _242ValidAnagram {
    public static void main(String[] args) {

//        String s = "rat";
        String s = "rac";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

//======================================================================================
// Optimal Solution log(N) using ASCII table arrays[0, 0, 0, 0, 0]
//======================================================================================
    public static boolean isAnagram(String s, String t) {

        // creates an empty arrays w/ [26 o's] / [0, 0, 0, 0, 0...]
        int abc[] = new int[26];

        //checks if strings have the same lengths
        if (s.length() != t.length()) {
            return false;
        }


        //[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        for (char letter : s.toCharArray()) { //translates both Strings to char array right in the loop
            abc[letter - 'a'] += 1; //abc[67-65]// abc[2]
            //[0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0]
        }


        for (char letter : t.toCharArray()) { //translates both Strings to char array right in the loop
            abc[letter - 'a'] -= 1;
            //[0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        }


        //Option to combine two loops above in one
        //for (int = 0; i <s.length(); i++) {
        //  abc[s.charAt(i) - 'a'] += 1;
        //  abc[t.charAt(i) - 'a'] -= 1;
        //}

        for (int n : abc) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
//======================================================================================
// HashMap Solution log(N) Space complexity O(1) if all characters are known
//======================================================================================
//    public static boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> d = new HashMap<>();
//
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        for(int i=0; i < s.length(); i++){
//
//            if(d.containsKey(s.charAt(i))){
//                //adds to dict d under character(aka key) at index i from string s number 1
//                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
//            }
//            else{ d.put(s.charAt(i), 1);}
//        }
//        for(int i=0; i < s.length(); i++){
//
//            if(d.containsKey(t.charAt(i))){
//                //adds to dict d under character(aka key) at index i from string s number 1
//                d.put(t.charAt(i), d.get(t.charAt(i)) - 1);
//            }
//            else{ d.put(t.charAt(i), 1);}
//        }
//        for (int value: d.values()) {
//            if (value != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

//======================================================================================
// HashMap Solution log(N) Space complexity double from above solution
//======================================================================================
//    public static boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> d = new HashMap<>();
//        HashMap<Character, Integer> d2 = new HashMap<>();
//
//        s.toLowerCase();
//        t.toLowerCase();
//
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (d.containsKey(s.charAt(i))) {
//                int count = d.get(s.charAt(i));
//                count++;
//                d.put(s.charAt(i), count);
//            } else {
//                d.put(s.charAt(i), 1);
//            }
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (d2.containsKey(t.charAt(i))) {
//                int count = d2.get(t.charAt(i));
//                count++;
//                d2.put(t.charAt(i), count);
//            } else {
//                d2.put(t.charAt(i), 1);
//            }
//        }
//
//        if(d.equals(d2)){
//            return true;
//        }
//        return false;
//    }
//}

//======================================================================================
// Solution nlog(N)
//======================================================================================

//    public static boolean isAnagram(String s, String t) {

//        int count = 0;
//        //checks if strings have the same lengths
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        //translates both Strings to char array so it can be sorted. (nlog(N)) though
//        char[] sChar = s.toCharArray();
//        char[] tChar = t.toCharArray();
//
//        //Sorts both arrays
//        Arrays.sort(sChar);
//        Arrays.sort(tChar);
//
//        //creates string by using String creating and passing char array as a parameter
//        String sNewString = new String(sChar);
//        String tNewString = new String(tChar);
//
//        //compares two String to each other
//        if (sNewString.equalsIgnoreCase(tNewString)){
//        // if (String(Arrays.sort(s.toCharArray())).equalsIgnoreCase(String(Arrays.sort(t.toCharArray()))))
//            return true;
//        }
//        return false;
//    }
//}

