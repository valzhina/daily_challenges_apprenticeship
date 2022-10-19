import java.util.Arrays;

public class _338CountingBits {
    public static void main(String[] args){
        int num = 5;
        System.out.println(Arrays.toString(countBits(num)));
    }

// Option 1
//    public static int[] countBits(int n){
//        int[] ans = new int [n + 1];
//        for (int i = 0; i < n + 1; i++){
//            ans[i] = hammingWeight(i);
//        }
//        return ans;
//    }
//
//    public static int hammingWeight(int num){
//        int count = 0;
//        for (int i = 0; i < 32; i++){
//            if(((num >> i) & 1) == 1){
//                count++;
//            }
//        }
//        return count;
//    }


// Option 2
//    public static int[] countBits(int n){
//        int[] ans = new int [n + 1];
//        for (int i = 1; i < ans.length; i++){
//            ans[i] = helperFunction(i);
//            System.out.println(ans[i]);
//        }
//        return ans;
//    }
//    public static int helperFunction(int i){
//        int count = 0;
//        while(i != 0){
//            if(i % 2 > 0){count++;}
//            i = i /2;
//        }
//        return count;
//    }

// Option 3 Dynamic programming
    public static int[] countBits(int n){

        int ans[] = new int[n+1];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i / 2] + (i % 2);
        }
        return ans;
    }
}
