public class LowercaseVowels28 {
    
    public static int isLowerCaseVowel(String s) {
        int c=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                c++;
            }
        }
        return c;
    }
    public static void main(String args[]) {
        String str = "abcdef";

        System.out.print("Output: "+isLowerCaseVowel(str));
    }
}
