package ArraysPractice;

public class BuySellStocks {

    public static int maxProfit(int arr[]) {
        int profit = 0;
        int cost = 0;
        int min = arr[0];

        for(int i=0; i<arr.length; i++) {
            // fixed the min element, and changing max element and subtracting
            cost = arr[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(arr[i], min);
        }
        return profit;
    }
    public static void main(String args[]) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
