
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTimeToBuySell(prices));
    }

//    public static int bestTimeToBuySell(int[] prices){
//        int toBuy = prices[0];
//        int profit = 0;
//
//        for(int price: prices){
//            if (price < toBuy){
//                toBuy = price;
//            }
//            if (price - toBuy > profit){
//                profit = price - toBuy;
//            }
//        }
//        return profit;
//    }
//}
//    //Brute-force
//    public static int bestTimeToBuySell(int[] prices){
//        int maxProfit = 0;
//
//        for (int i = 0; i < prices.length; i++){
//            for(int j = i + 1; j <prices.length; j++){
//                if((prices[j] - prices[i])  > maxProfit){
//                    maxProfit = (prices[j] - prices[i]);
//                }
//            }
//        }
//        return maxProfit;
//    }
//}

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++){
            //Update profit if current difference between min purchasable  and current is better
            maxProfit = Math.max((minPrice + prices[i]), maxProfit);
            //update minim purchasable if current price is better
            minPrice = Math.max(minPrice, -prices[i]);
        }
        return maxProfit;
 }
}