import java.util.HashSet;
import java.util.Iterator;

class HashSets {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();

        set.add("Delhi");
        set.add("Kanpur");
        set.add("Lucknow");
        set.add("Jaipur");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        for(String c : set) {
            System.out.print(c + " ");
        }
    }
}