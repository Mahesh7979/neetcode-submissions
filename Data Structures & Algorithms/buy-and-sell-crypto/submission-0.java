class Solution {
    public int maxProfit(int[] prices) {
        int maxmin  = Integer.MAX_VALUE,profit = 0, maxprofit = 0;
        for(int a : prices){
            maxmin = Math.min(maxmin,a);

            profit = a - maxmin;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}
