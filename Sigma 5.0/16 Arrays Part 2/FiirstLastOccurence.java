public class FiirstLastOccurence {
    int lowerBound(int arr[], int x) {
        int n = arr.length;
        int low = 0; int high = n-1;
        int ans = n;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    int upperBound(int arr[], int x) {
        int n = arr.length;
        int low = 0;
        int high = n -1;
        int ans = n;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        
        int lb = lowerBound(nums,target);
        
        int n = nums.length;
        int ans[] = {-1,-1};

        if(lb == n || nums[lb] != target) {
            return ans;
        }
        else {
            ans[0] = lb;
            ans[1] = upperBound(nums,target) - 1;
            return ans;
        }
    }

    public static void main(String args[]) {
        FiirstLastOccurence obj = new FiirstLastOccurence();

        int arr[] = {5,7,7,8,8,10};
        int target = 10;
        int []ans = obj.searchRange(arr,target);

        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
