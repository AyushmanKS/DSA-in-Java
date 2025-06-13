import java.util.HashMap;
import java.util.Map;

public class BeautifulNumber {

    // Check if a number is beautiful
    public static boolean isBeautiful(int n) {
        String str = String.valueOf(n);
        Map<Character, Integer> countMap = new HashMap<>();

        // Count occurrences of each digit
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Check if each digit appears exactly digit times
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            int digit = entry.getKey() - '0';
            int occurrences = entry.getValue();

            if (digit != occurrences) {
                return false;
            }
        }

        return true;
    }

    // Find the next beautiful number greater than n
    public static int nextBeautifulNumber(int n) {
        int candidate = n + 1;
        while (true) {
            if (isBeautiful(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    public static void main(String[] args) {
        int N = 250; 

        if (isBeautiful(N)) {
            System.out.println(N);
        } else {
            int res = nextBeautifulNumber(N);
            System.out.println(res);
        }
    }
}

