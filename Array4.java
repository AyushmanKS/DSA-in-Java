import java.util.*;

public class Array4 {
    public static void main(String args[])
    {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        sc.close();

        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }    
}
