public class Tiling {
        
        public static int tilingProblem(int n) {

            // vertical choice
            int fnm1 = tilingProblem(n-1);
            
            // horizontal choice
            int fnm2 = tilingProblem(n-2);

            //int totWays = fnm1 + fnm2;
            //return totWays;

            return fnm1 + fnm2;
        }
        public static void main(String args[]) {
            System.out.println(tilingProblem(4));
        }
}
