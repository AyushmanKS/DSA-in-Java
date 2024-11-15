/*
    *
   **
  ***
 ****
*****
 */
public class InvertedRotatedHalfPyramid {
    
    public static void invertedRotatedHalfPyramid(int n) {
        for(int i=1; i<=n; i++) {

            // printing spaces ' '
            for(int j=1; j<=n-i; j++) {
                System.out.print(' ');
            }
            // print stars
            for(int j=1; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        invertedRotatedHalfPyramid(5);
    }
}
