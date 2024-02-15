public class TrappingRainwater13 {

    public static int TrappedRainwater(int height[]) {

        int l = height.length;

        // left max boundary
        int leftMax[] = new int[l]; 
        leftMax[0] = height[0];

        for(int i=1; i<l; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // right max boundary
        int rightMax[] = new int[l]; 
        rightMax[l-1] = height[l-1];

        for(int i=l-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<l; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int bars[] = {4,2,0,6,3,2,5};
        System.out.print("Trapped water: "+TrappedRainwater(bars));
    }   
}
