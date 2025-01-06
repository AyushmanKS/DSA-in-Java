public class LongestcommonPrefix {

    static String longestCommonPrefix(String[] s) {
        String prefix = s[0];

        for(int i=1; i<s.length; i++) {
            while(!s[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
    public static void main(String args[]) {
        String[] s = {"flower","flight","flicker"};
        System.out.println(longestCommonPrefix(s));
    }
}
