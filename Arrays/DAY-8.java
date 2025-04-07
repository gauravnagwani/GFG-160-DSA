class Solution {
    public int maximumProfit(int prices[]) {
        int maxProfit =0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit , prices[i]-buyPrice);
            }
        }
    return maxProfit;
    }
}