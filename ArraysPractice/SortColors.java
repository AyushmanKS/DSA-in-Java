package ArraysPractice;
// sort an array consisting only of 0,1 and 2's
public class SortColors {
    
    public static int[] sortColors(int arr[]) {
        int l = arr.length;
        int c0=0; int c1=0; int c2 = 0;

        for(int i=0; i<l; i++) {
            if(arr[i] == 0) 
                c0++;
            
            if(arr[i] == 1) 
                c1++;
            
            if(arr[i] == 2) 
                c2++;  
        }
        int idx = 0;
        for(int i=0; i<c0;i++) 
            arr[idx++] = 0;
            
        for(int i=0; i<c1;i++) 
            arr[idx++] = 1;
             
        for(int i=0; i<c2;i++) 
            arr[idx++] = 2;
            
        return arr;    
    }
    public static void main(String args[]) {
        int arr[] = {0,1,1,2,2,0,1,1,2,2,2};
        int []ans = sortColors(arr);

        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
