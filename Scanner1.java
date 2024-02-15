import java.util.*;

public class Scanner1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a string: ");
        String s = sc.nextLine();
        System.out.print(s);

        sc.close();
    }
}
