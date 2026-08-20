class Solution {
    public int maxProfit(int[] prices) {
        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int currentProfit = 0;
            if (prices[i] < buyStock) {
                buyStock = prices[i];
            }
            if (prices[i] > buyStock) {
                currentProfit = prices[i] - buyStock;
            }
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
