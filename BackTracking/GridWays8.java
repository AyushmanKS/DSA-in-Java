public class GridWays8 {

    // factorial function
    public static int factorial(int a) {
        int fact = 1;
        for(int i=1; i<=a; i++) {
            fact *= i;
        }
        return fact;
    } 

    // o(n) time solution
    public static int PermudationGridWays(int n, int m) {
        int permudation = ( factorial( (n-1) + (m-1)) )/ ( factorial(n-1) * factorial(m-1) );
        return permudation;
    }
    
    
    // 2^(m+n)  time complexity solution
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if(i == n-1 && j == m-1) {
            return 1;
        }
        // border line condition 
        else if(i==n || j==m){
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String args[]) {
        int m = 3; int n = 3;
        System.out.println(gridWays(0, 0, n, m));
        System.out.println(PermudationGridWays(n, m));
    }
}
