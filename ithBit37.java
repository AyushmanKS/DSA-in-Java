public class ithBit37 {
    
    //Update Ith Bit
    public static int updateIthBit(int n, int i, int newBit) {
        int m = clearIthBit(n, i);
        int bitMask = newBit<<i;

        return m | bitMask;
    }

    // clear Ith Bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // set Ith Bit
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    // get Ith Bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String args[]) {
        int n = 10;
        int i = 2;

        System.out.println(getIthBit(n, i));
        System.out.println(setIthBit(n, i));
        System.out.println(clearIthBit(n, i));
        System.out.println(updateIthBit(n, i, 1));
    }
}
