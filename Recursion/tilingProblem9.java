package Recursion;

public class tilingProblem9 {
    public static int tiling(int n) {
        // base case
        if(n==0 || n==1) {
            return 1;
        }
        // actual process.................
        // vertical first choice
        int fnm1 = tiling(n-1);

        // horizontal first choice
        int fnm2 = tiling(n-2);

        int total_ways = fnm1 + fnm2;
        return total_ways;
    }
    public static void main(String args[]){
        System.out.println(tiling(3));
    }
}
