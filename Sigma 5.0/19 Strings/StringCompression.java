public class StringCompression {

    public static String compression(String s) {
        StringBuilder newStr = new StringBuilder();
        int count = 1; 

        for (int i = 0; i < s.length(); i++) {

            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr.append(s.charAt(i));

            if (count > 1) {
                newStr.append(count);
            }
            count = 1;
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbccddd";
        System.out.println(compression(s)); 
    }
}
