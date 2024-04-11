package BackTracking;

public class KeypadCombinations11 {
    // Define a mapping of digits to letters
    private static final String[] LETTERS_MAPPING = {
        "",     // 0 doesn't map to any letters
        "",     // 1 doesn't map to any letters
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void main(String args[]) {
        String digits1 = "23";
        System.out.println("Sample Input 1 : " + digits1);
        System.out.print("Sample Output 1 : ");
        letterCombinations(digits1);
        System.out.println();

        String digits2 = "2";
        System.out.println("Sample Input 2 : " + digits2);
        System.out.print("Sample Output 2 : ");
        letterCombinations(digits2);
        System.out.println();
    }

    public static void letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return;
        }
        generateCombinations(digits, "", 0);
    }

    private static void generateCombinations(String digits, String current, int index) {
        // Base case: if the current combination has the same length as digits, print it
        if (index == digits.length()) {
            System.out.print(current + " ");
            return;
        }

        // Get the letters corresponding to the current digit
        String letters = LETTERS_MAPPING[digits.charAt(index) - '0'];
        // For each letter in the current digit's letters, append it to the current combination and proceed to the next digit
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, current + letters.charAt(i), index + 1);
        }
    }
}
