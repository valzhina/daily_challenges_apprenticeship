import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15,3};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> d = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(d.containsKey(target - nums[i])){
                return new int[] {i, d.get(target - nums[i])};
            }
            d.put(nums[i], i);
        }
        return new int[] {-1};
    }

    //Brute-force solution w/ O(N)square time complexity
//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length -1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if ((nums[i] + nums[j] == target))
//                    return new int[] {i, j};
//            }
//        }
//        return new int[]{-1};
//    }
}

