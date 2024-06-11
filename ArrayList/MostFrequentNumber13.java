package ArrayList;

import java.util.ArrayList;

public class MostFrequentNumber13 {
    static int moreFrequentNumber(ArrayList<Integer>nums, int key) {
        int maxCount = 0;
        int maxTarget = -1;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int target = nums.get(i + 1);
                int count = 1;
                // Counting how many times target follows key
                for (int j = i + 2; j < nums.size(); j++) {
                    if (nums.get(j) == target) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    maxTarget = target;
                }
            }
        }
        return maxTarget;
    }
    
    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        // nums.add(1); 
        // nums.add(100);
        // nums.add(200);
        // nums.add(1);
        // nums.add(100);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        //int key = 1;
        int key = 2;

        System.out.println(moreFrequentNumber(nums, key));
    }
}
