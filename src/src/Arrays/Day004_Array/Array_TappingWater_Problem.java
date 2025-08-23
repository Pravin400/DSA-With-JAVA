package Arrays.Day004_Array;

public class Array_TappingWater_Problem {

    public static int tappedWater(int height[]) {
    //here calculate teh left max bondary of array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
    //here calculate the right max boundary array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop for calculating tapped water
        int tappedWater = 0;//initially tepped water is 0
        for(int i = 0;i<height.length;i++){
             //waterlevel = min(leftmax bounnd,rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trapped water = wwaterlevel - height[i]
            tappedWater += waterLevel -height[i];
        }
        return tappedWater;

    }

    public static void main(String[] args) {
        int height [] = { 4,2,0,6,3,2,5};
        System.out.println(tappedWater(height));

    }
}
