// Anagrams: if two strings contain same characters but in a different order
import java.util.Arrays;

public class Anagrams29 {
    public static boolean isAnagram(String s, String t) {

        // if lengths are not equal return false
        if(s.length() != t.length()) 
            return false;
        
        // converting String to array
        char [] s1Array = s.toCharArray();
        char [] s2Array = t.toCharArray();

        // Sorting both arrays
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        if(Arrays.equals(s1Array,s2Array)) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        String s1 = "racea";
        String s2 = "carea";

        System.out.print("Output: "+isAnagram(s1, s2));
    }
}
