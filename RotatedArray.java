public class RotatedArray {
    public static void main(String[] args) {

        int a = RotatedArray(new int[] {13,14,1,3,5,7,9,10,12});
        System.out.println(a);
    }

    public static int RotatedArray(int [] num){

        if(num == null || num.length == 0) {
            return -1;
        }

        int left = 0;
        int right = num.length - 1;
        int middle;

        if(num[0] < num[right]){
            return num[0];
        }
        while(left < right) {
            middle = (Integer) (left + right) / 2;
            

            if(num[middle] > num[left]){
                left = middle + 1;
            }
            else {
                right = middle;
            }
        }
        return left;
    }
}