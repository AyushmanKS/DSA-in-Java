package Recursion;

public class FriendsPairing11 {
    
    public static int Pairing(int n) {
        if(n ==1 || n==2) {
            return n;
        }
        // choice to stay single
        int f_n_minus_1 = Pairing(n-1);
        
        // pair
        int f_n_minus_2 = Pairing(n-2);
        int PairWays = (n-1) * f_n_minus_2;

        // total Ways
        return ( f_n_minus_1 + PairWays );
    }
    public static void main(String args[]) {
        System.out.println(Pairing(3));
    }
}
