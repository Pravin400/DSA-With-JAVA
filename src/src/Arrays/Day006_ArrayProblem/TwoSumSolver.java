package Arrays.Day006_ArrayProblem;

public class TwoSumSolver {
    public static void main(String[] args) {
        int [] num = {10,-1,5,4,8,-2};

        sum(num);
    }
    public static void sum(int[] num){
        int target = 9;
        int sum = 0;
        for(int i=0;i<num.length;i++){
            sum = num[i];
            for(int j=i+1;j<num.length;j++){
                sum+=num[j];
                if(sum==target){

                    System.out.println("{"+i+","+j+"}");
                    return;
                }
            }
        }
        System.out.println("{ -1 , -1}");

    }
}
