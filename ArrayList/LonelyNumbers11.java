package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers11 {

    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            if((i == 0 || list.get(i - 1) + 1 < list.get(i)) && (i == list.size() - 1 || list.get(i) + 1 < list.get(i + 1))) {
                ans.add(list.get(i));
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(6); list.add(5); list.add(8);

        System.out.println(lonelyNumbers(list));
    }
}
