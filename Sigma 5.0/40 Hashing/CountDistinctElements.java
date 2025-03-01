import java.util.HashSet;

public class CountDistinctElements {

    public static int countDistinctElements(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }
        return set.size();
    }
    public static void main(String args[]) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(countDistinctElements(arr));
    }
}
