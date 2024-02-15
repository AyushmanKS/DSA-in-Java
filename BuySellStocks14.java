public class BuySellStocks14 {
    
    public static int buySellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {

            // profit case
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                // calcuating maximum profit
                maxProfit = Math.max(maxProfit, profit);
            }
            // no profit case
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] ={7,1,5,3,6,4};

        System.out.println("Maximum Profit: "+buySellStocks(prices));
    }    
}
