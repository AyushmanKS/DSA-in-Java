// Finding subsets of a String n = 2^n

public class Subsets2 {
    
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        // Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        // No choice
        findSubsets(str, ans, i+1);
    }

    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str, "", 0);
        System.out.println("all possible combinations: "+Math.pow(2, str.length()));
    }    
}