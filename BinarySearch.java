public class BinarySearch {
    public static void main(String[] args) {

        int a = BinarySearchF(new int[] {1,3,5,7,9,10,12,13,14}, 100);
        System.out.println(a);
    }

    public static int BinarySearchF(int [] array, int target){

        if(array == null || array.length == 0) {
            return -1;
        }

        int left = 0;
        int right = array.length - 1;
        int middle;
        while(left <= right) {
            middle = (Integer) (left + right) / 2;
            if(array[middle] == target){ //O(1)
                return middle;
            }
            else if(array[middle] < target) {
                left = middle + 1;
            }
            else {
                right = middle;
            }
        }
        return -1;
    }
}