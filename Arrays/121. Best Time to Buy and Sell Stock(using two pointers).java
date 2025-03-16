class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n= prices.length;
        int i=0, j=1;
        while(j!=n){
            if(prices[i]>prices[j]){
                i=j;
            }
            else{
                profit=Math.max(profit, prices[j]-prices[i]);   
            }
            j++;
        }
    return profit;
    }
}