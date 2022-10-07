public class _88MergeSortedArray {
 /*
 You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and
 two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside
the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements
denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.
nums2 has a length of n.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].


Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
*/
}
class Challenge{
    public static void main(String[] args) throws Exception {
//        System.out.println(merge(new int[] {1,2,3,0,0,0,}, 3, new int[] {2,5,6},3));
        merge(new int[] {1,2,3,0,0,0,}, 3, new int[] {2,5,6},3)
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i < m && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else {
                for (int k = nums1.length - 1; k > i; k--) {
                    nums1[k] = nums1[k - 1];
                }
                nums1[i] = nums2[j];
                j++;
            }
        }
        if (j < nums2.length) {
            for (int a = nums2.length - 1; a >= j; a--) {
                nums1[m + a] = nums2[a];
            }
        }
    }
}