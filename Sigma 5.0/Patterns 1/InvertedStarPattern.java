/*
*****
****
***
**
*
*/
public class InvertedStarPattern {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) { // number of rows
            for (int star = 5; star >= i; star--) { // stars in each row
                System.out.print('*');
            }
            System.out.println();
        }
    }
}