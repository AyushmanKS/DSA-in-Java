import java.util.Comparator;
import java.util.PriorityQueue;

class HalveArray {
    
    public static int halveArray(int[] nums) {
        int sum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            pq.add((double)nums[i]);
        }

        int target = sum/2;
        int currSum = sum;
        int c = 0;
    
        while(currSum > target) {
            double largest = pq.poll();
            currSum -= largest/2;
            pq.add(largest/2);
            c++;
        }
        return c;
    }
    public static void main(String args[]) {
        int nums[] = {5, 19, 8, 1};
        System.out.print(halveArray(nums));     
    }
}