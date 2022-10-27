import java.util.Arrays;

public class _238ProductOfArrayExceptSelf {
    public static void main(String[] args) {

//        int[] a = {};
//        int[] a = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productOfArray(a)));
    }

//======================================================================================
// Solution
//======================================================================================

//    public static int[] productOfArray(int[] nums) {
//
//        int[] result = new int[nums.length];
//        int temp = 1;
//
//        if(nums.length == 0){
//            return new int[0];
//        }
//
//        for(int i = 0; i < nums.length; i++){
//            result[i] = temp;
//            temp = temp * nums[i];
//            System.out.println(Arrays.toString(result));
//        }
//        temp = 1;
//        System.out.println("=============");
//        for(int i = nums.length-1; i>=0; i--) {
//            result[i] = result[i]*temp;
//            temp=temp*nums[i];
//            System.out.println(Arrays.toString(result));
//        }
//
//        return result;
//    }
//}

    public static int[] productOfArray(int[] input) {

        int[] output = new int[input.length];
        int[] lProduct = new int[input.length];
        int[] rProduct = new int[input.length];

        lProduct[0] = 1;
        rProduct[rProduct.length - 1] = 1;

        for (int i = 1; i < input.length; i++) {
            lProduct[i] = lProduct[i - 1] * input[i - 1];
//            rProduct[(input.length - 1) - i] = rProduct[(input.length - 1) - i + 1] * input[(input.length - 1) - i + 1];
        }

        for (int i = rProduct.length - 2; i >= 0; i--) {
            rProduct[i] = rProduct[i+1] * input[i+1];
        }
        System.out.println(Arrays.toString(rProduct));
        System.out.println(Arrays.toString(lProduct));

        for (int i = 0; i < input.length; i++) {
            output[i] = lProduct[i] * rProduct[i];
        }
        return output;
    }
}