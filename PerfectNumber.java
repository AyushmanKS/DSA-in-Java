public class PerfectNumber {
    
    static boolean checkPerfectNumber(int num) {
        int sum =1;
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                sum+=i;
                if((sum) == num) {
                    return true;
                }
            }
        }
        return false;    
    }

    public static boolean perfectNumber(int num) {
        int sum = 1;
        int sqrt = (int)Math.sqrt(num);

        if(num==1) return false;

        for(int i=2; i<=sqrt; i++) {
            if(num%i == 0) {
                sum+= i;
                if(i != num/i) {
                    sum+= (num/i);
                }
            }
        }
        return sum==num;
    }
    
    public static void main(String args[]) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
        System.out.println(perfectNumber(num));
    }
}
