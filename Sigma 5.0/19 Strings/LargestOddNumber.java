public class LargestOddNumber {
    
    public static String longestOddNumber(String s) {
        for(int i=s.length() -1; i>=0; i--) {
            if( (s.charAt(i) - '0') % 2 != 0 ) {
                return s.substring(0, i+1);
            }
        }
        return "No odd number";
    }
    public static void main(String args[]) {
        String s = "982";
        System.out.println(longestOddNumber(s));
    }
}
