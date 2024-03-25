// find all possible permudations of a string: example) for abc: length 3-> permudations= 3! = 3*2*1 = 6
package BackTracking;
public class Permudations3 {
    public static void permudations(String str, String ans) {
        // base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // work
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            permudations(NewStr, ans+curr);
        }
    }
    public static void main(String args[]) {
        String str = "abc";
        permudations(str, "");
    }
}
