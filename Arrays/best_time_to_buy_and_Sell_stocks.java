//goldman sachs

class Solution {
    public int maxProfit(int[] prices) {
      int low = Integer.MAX_VALUE;
        int result= 0;
        int sell= 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < low){
                low = prices[i];
            }
            sell = prices[i] - low;
            if(result < sell){
                result = sell;
            }
        }
        return result;
    }
}
