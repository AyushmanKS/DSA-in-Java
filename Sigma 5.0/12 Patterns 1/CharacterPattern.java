/*
A
BC
DEF
GHIJ
*/
public class CharacterPattern {
    static char c = 'A';

    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c += 1;
            }
            System.out.println();
        }
    }
}
