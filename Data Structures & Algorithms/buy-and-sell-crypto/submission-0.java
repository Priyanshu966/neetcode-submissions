class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;

        for(int i = 0; i < prices.length; i++){
            int profit = 0;
            for(int j = i + 1; j < prices.length; j++){

                if(prices[i] < prices[j]){
                    profit = prices[j] - prices[i];
                    if(profit > max){
                        max = profit;
                    }
                }

            }

        }

        return max;
        
    }
}
