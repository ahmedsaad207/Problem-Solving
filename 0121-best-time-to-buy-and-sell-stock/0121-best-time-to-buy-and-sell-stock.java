class Solution {
    public int maxProfit(int[] prices) {
        // int p1 = 0, p2 = 1, maxP = 0, profit =0;

        // while (p2 < prices.length) {
        //     if (prices[p2] > prices[p1]) {
        //         profit = prices[p2] - prices[p1];
        //         if (profit > maxP) maxP = profit;
        //     } else p1 = p2;
        //     p2++;
        // }
        // return maxP;

        int buy = Integer.MAX_VALUE, maxProfit=0;

        for (int i : prices) {
            if (i > buy) {
                if ((i-buy) > maxProfit) {
                    maxProfit = i-buy;
                }
            } else {
                buy = i;
            }
        }

        return maxProfit;
    }
}