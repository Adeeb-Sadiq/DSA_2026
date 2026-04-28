package slidingwindow;

public class Stocks {

    // best time to buy and sell stocks for max profit
    // https://neetcode.io/problems/buy-and-sell-crypto/question?list=neetcode150
    public static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxProfit = 0;

        while (r < prices.length) {
            if(prices[r] > prices[l]) {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }

    static void main() {
        int[] arr = {10,1,5,6,7,1};
        System.out.println(maxProfit(arr));
    }
}
