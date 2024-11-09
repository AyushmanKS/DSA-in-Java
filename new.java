// an arry to find duplicates and remove it
// arr[]={1,8,5,5,3,8,1,2}

public class new {

    public static removeDuplicates(int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    ArrayList.get(arr[i]);
                }
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = {1,8,5,5,3,8,1,2};

    }
}