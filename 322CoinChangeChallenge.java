import java.util.Arrays;

public class Challenge322CoinChange {

    public static void main (String[] args){
        int[] coins = {1, 2, 5};
//        makeChange(coins, 5);
        System.out.println(makeChange(coins, 14));
    }

    public static int makeChange(int[] coins, int amount) {
        // coins = {1,5,10,25}
        // amount = 13

    public static int fib(int numberToFind){
        int[] outputs = new int[amount+1];
        Arrays.fill(outputs, -1);

        if(outputs[numberToFind] != -1){
            return  outputs[numberToFind];
        }
        else{
            outputs[numberToFind] = fib(numberToFind-1)
        }
        return fib(numberToFind-1) + fib(numberToFind -1);
    }



//        {0,1,2,3,4,5}

        Arrays.fill(outputs, 1, outputs.length, amount + 1);
        //[0, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14]
        //[0, 6, 6, 6, 6, 6]

        for (int coin: coins){
            for(int i = coin; i < outputs.length; i++){
                outputs[i] = Math.min(outputs[i], outputs[i - coin] + 1);
            }
//            System.out.println(Arrays.toString(outputs));
        }
        return outputs[amount];
    }
//    public static void main(String[] args) {

//        int[] coins = {1, 5};
//        makeChange(coins, 11);
//    }
//
//    public static int makeChange(int[] coins, int amount)
//        int count = 0;
//        int remainingTotal = amount;
//
//        if(coins[coins.length - 1] > amount) return -1;
//        if(amount == 0) return 0;
//
//        int i = coins.length - 1;
//
//        while (remainingTotal > 0) {
//            try{
//                if(coins[i] <= remainingTotal){
//                    remainingTotal -= coins[i];
//                    count++;
//                }
//                else {
//                    i--;
//                }
//            } catch (ArrayIndexOutOfBoundsException e) {
//                return -1;
//            }
//        }
//        return count;
//    }
}

