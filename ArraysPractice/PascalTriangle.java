package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    // to calculate nCr
    public static long nCr(int n, int r) {
        long res = 1;

        for(int i=0; i<r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    // to return particular element of pascalsTriangle
    public static int pascalTriangle(int r, int c) {
        int element = (int)nCr(r-1,c-1);
        return element;
    }
    
    // print complete pascalTriangle
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);

        for(int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for(int j = 1; j < i; j++) {
                curr.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }
    public static void main(String args[]) {
        int r = 5;
        int c = 3;
        int element = pascalTriangle(r,c);
        System.out.println(element);

        System.out.println(generate(5));
    }
}
