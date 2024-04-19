public class Kaprekar {

    public static boolean isKaprekar(int n) {
        int num = n * n;
        int l = String.valueOf(num).length(); //length of the squared number
        String s = String.valueOf(num);
        
        int newS1 = Integer.parseInt(s.substring(0, l / 2)); // Extract the first half
        int newS2 = Integer.parseInt(s.substring(l / 2));   // Extract the second half
        int finalS = newS1 + newS2;
        
        if (n == finalS) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int num = 9; //7777;//55;
        if (isKaprekar(num)) {
            System.out.println("It is a Kaprekar number");
        } else {
            System.out.println("It's not a Kaprekar number");
        }
    }
}
