public class CallByValue3 {


    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Printed by swap funcion: "+a+" "+b);
    }
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        System.out.println("Original values of a,b: "+a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);

        // values printed in main funcion are not reversed
        // becuase a copy of variables in sent to swap fxn not the original values
        // this is known as Call By Value
    }    
}
