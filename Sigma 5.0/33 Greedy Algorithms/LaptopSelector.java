import java.util.*;

public class LaptopSelector {

    public static List<Integer> getHighestRatedLaptops(int[] prices, int[] ratings, int[][] queries) {
        List<Integer> results = new ArrayList<>();

        for (int[] query : queries) {
            int low = query[0];
            int high = query[1];

            int minPrice = Integer.MAX_VALUE;
            int bestRating = -1;

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] >= low && prices[i] <= high) {
                    if (prices[i] < minPrice) {
                        minPrice = prices[i];
                        bestRating = ratings[i];
                    } else if (prices[i] == minPrice) {
                        bestRating = Math.max(bestRating, ratings[i]);
                    }
                }
            }
            results.add(bestRating);
        }

        return results;
    }

    public static void main(String[] args) {
        int[] prices =  {30000, 45000, 25000, 45000, 25000};
        int[] ratings = {300,   400,   500,   200,   400};
        int[][] queries = {
            {20000, 30000},
            {40000, 50000},
            {25000, 45000}
        };

        List<Integer> result = getHighestRatedLaptops(prices, ratings, queries);
        for (int rating : result) {
            System.out.println(rating);
        }
    }
}
