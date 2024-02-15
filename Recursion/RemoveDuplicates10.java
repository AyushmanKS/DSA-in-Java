package Recursion;
// remove duplicates in a string
public class RemoveDuplicates10 {
    
    public static void removeDplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base case
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        if(map[currentChar-'a'] == true) {
            // duplicate found
            removeDplicates(str, idx+1, newStr, map);
        } 
        else {
            map[currentChar-'a'] = true;
            removeDplicates(str, idx+1, newStr.append(currentChar), map);
        }
    }
    public static void main(String args[]) {
        String str = "aayyuushmannn";
        removeDplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
