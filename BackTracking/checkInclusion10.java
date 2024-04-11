package BackTracking;

public class CheckInclusion10 {
    public static boolean permuteAndCheck(String s1, String ans, String s2) {
        // Base case
        if (s1.length() == 0) {
            return contains(ans, s2);
        }
        
        // checking for permudations
        for (int i = 0; i < s1.length(); i++) {
            char curr = s1.charAt(i);
            // Generate new string by removing the current character
            String newStr = s1.substring(0, i) + s1.substring(i + 1);
            // Recursively generate permutations and check for inclusion
            if (permuteAndCheck(newStr, ans + curr, s2)) {
                return true;
            } 
        }
        
        return false;
    }
    // checking if s2 contains s1 permudations
    public static  boolean contains(String s1, String s2) {
        return s2.contains(s1);
    }

    public static void main(String args[]) {
        String s1 ="ab";
        String s2 = "eidbaooo";

        if(permuteAndCheck(s1,"",s2)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }


}
