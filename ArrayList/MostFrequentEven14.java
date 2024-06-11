package ArrayList;

import java.util.Arrays;

public class MostFrequentEven14 {

    static int mostFrequentEvenNumber(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        int mostFrequentElement = -1; 
        int maxCount = 0;
        int currentCount = 0;
        int currentElement = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) { // Only consider even numbers
                if (arr[i] == currentElement) {
                    currentCount++;
                } else {
                    currentElement = arr[i];
                    currentCount = 1;
                }

                if (currentCount > maxCount || (currentCount == maxCount && currentElement < mostFrequentElement)) {
                    maxCount = currentCount;
                    mostFrequentElement = currentElement;
                }
            }
        }
        return mostFrequentElement;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 4, 4, 2, 2, 1};
        System.out.println(mostFrequentEvenNumber(arr)); // Should output 2
    }
}
