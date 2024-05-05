package ArrayList;
import java.util.ArrayList;

public class IntroArrayList1 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,5);
        System.out.println(list);

        // read / get element
        System.out.println(list.get(1));

        // remove element
        list.remove(0);
        System.out.println(list);

        // set element at index
        list.set(0, 5);
        System.out.println(list);

        // contains
        System.out.println(list.contains(2));

        // size
        System.out.println(list.size());
    }
}
