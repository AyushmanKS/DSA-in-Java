import java.util.HashSet;

public class UnionIntersection {
    public static void main(String args[]) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        // Finding union
        HashSet<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        System.out.println("Union: " + union);

        // Finding intersection (optimized to O(n + m))
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : arr2) {
            set2.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (int num : arr1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}
