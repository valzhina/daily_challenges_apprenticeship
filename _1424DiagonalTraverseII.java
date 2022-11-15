import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1424DiagonalTraverseII {

    public static void main(String[] args) {

//        int[] a = {};
//        int[] a = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[][] nums = {{1,1,1},{1,0,1},{1,1,1}};
        findDiagonalOrder(nums);
        for (int res[]: matrix)
            System.out.println(Arrays.toString(res));

//        1 2 3 4 5
//        6 7
//        8
//        9 10 11
//        12 13 14 15 16

    }
    public static int[] findDiagonalOrder(List<List<Integer>> nums) {

        ArrayList out = new ArrayList();
        boolean done = false;
        // our bound determined by mun function. #1 would be i + 1
        for (int i = 0; !done; i = Math.min(i + 1, nums.size() - 1)) {
            done = true;
            for (int j = i; j >= 0; j--) {
                //remove first element of line j
                if (!nums.get(j).isEmpty()) {
                    out.add(nums.get(j).remove(0));
//                    System.out.println(nums.get(j).remove(0) + " ");
                    done = false;
                }
            }
        }
        int[] output = new int[out.size()];
        for (int i = 0; i < out.size(); i++) {
            output[i] = out.get(i);
        }
        return output;
    }
}
