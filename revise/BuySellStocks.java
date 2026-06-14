package revise;

// https://neetcode.io/problems/buy-and-sell-crypto/question
public class BuySellStocks {
    static void main() {
        System.out.println(maxProfit(new int[] {10,1,5,6,7,1}));
        System.out.println(maxProfit(new int[] {10,8,7,5,2}));
    }

    public static int maxProfit(int[] prices) {
        int maxP = 0;
        int l = 0, r = 1;
        while(r < prices.length) {
            if(prices[r] > prices[l]) maxP = Math.max(maxP, prices[r] - prices[l]);
            else l = r;
            r++;
        }
        return maxP;
    }
}
