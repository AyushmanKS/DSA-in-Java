package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class SortingArrayList5 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9); list.add(0); list.add(1); list.add(-5); list.add(70); 

        Collections.sort(list);
        System.out.println(list);

        // descending order sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }   
}
