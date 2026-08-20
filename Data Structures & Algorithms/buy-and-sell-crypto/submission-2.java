class Solution {
    public int maxProfit(int[] prices) {
        int byStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int currentProfit = 0;
            if (prices[i] < byStock) {
                byStock = prices[i];
            }
            if (prices[i] > byStock) {
                currentProfit = prices[i] - byStock;
            }
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
