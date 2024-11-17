public class BinarySearch {
    
    public static int binarySearch(int nums[], int key) {
        int s = 0;
        int e = nums.length-1;

        while(s <= e) {
            int mid = (s+e)/2;

            if( nums[mid] == key) {
                return mid;
            }
            // key is less than mid
            if( nums[mid] > key) {
                e = mid-1;
            }
            // key is greater than mid
            if( nums[mid] < key) {
                s = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("Index for key is: "+binarySearch(numbers, key));
    }    
}
