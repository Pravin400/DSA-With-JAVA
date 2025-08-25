package Arrays.Day006_ArrayProblem;

public class Array_MaxSubArraySum {
    public static void main(String[] args) {
        int[] number = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print("Actual Array : { ");
        for(int i : number){
            System.out.print(i + " ");
        }
        System.out.print("}");

        Khande(number);
    }

    public static void Khande(int[] number) {
        int finalsum = Integer.MIN_VALUE;
        int tempsum = 0;
        int start = 0, end = 0, s = 0;

        for(int i=0;i<number.length;i++){
            tempsum += number[i];

            if(tempsum > finalsum){
                finalsum = tempsum;
                start = s;
                end = i;
            }

            if(tempsum < 0){
                tempsum = 0;
                s = i + 1;
            }
        }


        System.out.println("\nMaximum Profit: " + finalsum);
        System.out.print("SubArray : { ");
        for(int k = start; k <= end; k++){
            System.out.print(number[k]+" ");
        }
        System.out.print("}");
    }
}
