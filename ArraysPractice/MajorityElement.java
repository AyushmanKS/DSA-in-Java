package ArraysPractice;

public class MajorityElement {
    
    public static int majorityElement(int v[]) {
        int n = v.length;
        for (int i = 0; i < n; i++) {
            //selected element is v[i]
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                // counting the frequency of v[i]
                if (v[j] == v[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (n / 2))
                return v[i];
        }

        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {3,2,32};
        System.out.println(majorityElement(arr));
    }
}
