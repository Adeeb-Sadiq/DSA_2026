package greedy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
public class MaxProfitStocks {
    static void main() {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(new int[] {1,2,3,4,5}));
        System.out.println(maxProfit(new int[] {7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
