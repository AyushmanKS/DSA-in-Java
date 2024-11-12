/*
*
**
***
****
*****
 */
public class StarPattern {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) { // number of rows
            for (int star = 1; star <= i; star++) { // number of starts in each row
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
