class Solution {
    public int maxProfit(int[] prices) {

        int profit=Integer.MIN_VALUE;
        int buy_stock=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            buy_stock=Math.min(prices[i],buy_stock);
            profit=Math.max(profit,prices[i]-buy_stock);
        }
        return profit;
    }
}