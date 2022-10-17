package _268;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _268MissingNumber {

    public static void main(String[] args) {

//        int[] a = {};
        int[] a = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(a));
    }

//======================================================================================
// Solution O(N) hashmap
//======================================================================================

    public static int missingNumber(int[] nums) {
        HashMap<Integer, Boolean> numMap = new HashMap<>();

        for (int num : nums) {
            numMap.put(num, true);
        }
        for (int i = 0; i <nums.length; i++)
        {
            if (!numMap.containsKey(i)) {
                return i;
            }
        }
        return nums.length;
    }
}
//======================================================================================
// Solution O(N)
//======================================================================================
//    public static int missingNumber(int[] nums) {
//
//        // sum of all numbers in array
//        int theSum = (nums.length * (nums.length + 1)) / 2;
//        System.out.println(theSum);
//
//        for (int num : nums) {
//            theSum -= num;
//        }
//        return theSum;
//    }
//}

//======================================================================================
// Solution O(2N)
//======================================================================================
//    public static int missingNumber(int[] nums) {
//
//        int theSum = nums.length;
//        for (int i = 0; i < nums.length; i++){
//            theSum += i;
//        }
//        for (int i = 0; i < nums.length; i++){
//            theSum -= nums[i];
//        }
//        return theSum;
//    }
//}

//======================================================================================
// Solution O(N)
//======================================================================================
//    public static int missingNumber(int[] nums) {
//
//        int theSum = nums.length;
//        for (int i = 0; i < nums.length; i++){
//            theSum += i - nums[i];
//        }
//        return theSum;
//    }
//}


//======================================================================================
// Solution O(N)^2(sq)
//======================================================================================

//    public static int missingNumber (int[] nums) {
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.stream(nums).boxed().toList());
//
//        //loop through number 0 to the length
//        //check if the current ArrayList contains i
//        System.out.println(Arrays.toString(nums));
//        System.out.println(numbers);
//        for (int i = 0; i <= nums.length; i++) {
//            if (!numbers.contains(i)) {
//                return i;
//            }
//            //if the list has every number
//        }
//        return -1;
//    }
//}