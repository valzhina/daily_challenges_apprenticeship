public class _191_NumberOfOneBit {

    public static void main(String[] args) {

//        int a = hammingWeight(3);
        System.out.println(hammingWeight(15));
    }

    public static int hammingWeight(int num){
        int count = 0;
        //1001101
        //0000001

        for (int i = 0; i < 32; i++){
            if(((num >> i) & 1) == 1){
                count++;
            }
        }
        return count;
    }


//        public static int hammingWeight(int num){
//        int count = 0;
//
//        for (int i = 0; i < 32; i++){
//
//            if((num & 1) == 1){
//                count++;
//            }
//            num >>= 1;
//        }
//        return count;
//    }


//    public static int hammingWeight(int num){
//        return Integer.bitCount(num);
//    }
}
