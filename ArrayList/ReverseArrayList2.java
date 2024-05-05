package ArrayList;

import java.util.ArrayList;

public class ReverseArrayList2 {

    public static void reverse(ArrayList<Integer> list) {
        
        ArrayList<Integer> rev = new ArrayList<>();

        for(int i=list.size()-1; i>=0; i--) {
            rev.add(list.get(i));
        }
        System.out.println(rev);
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

        reverse(list);
    }
}
