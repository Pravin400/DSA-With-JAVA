package Arrays.Day004_ArraysExample;

public class Array_TappingWater_Problem {

    public static int tappedWater(int height[]) {
        // Step 1: Calculate left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Step 2: Calculate right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // Step 3: Calculate trapped water
        int tappedWater = 0;
        for(int i = 0; i < height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            tappedWater += waterLevel - height[i];
        }
        return tappedWater;
    }

    public static void main(String[] args) {
        int height [] = { 4,2,0,6,3,2,5 };
        //           |
//                   |           |
//      |            |           |
//      |            |   |       |
//      |   |        |   |   |   |
//      |   |        |   |   |   |
//     -------------------------

        System.out.println(tappedWater(height)); // Output: 11
    }
}
