package Arrays.Day006_ArrayProblem;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int [] num = {0,1,0,3,12};
        System.out.println("Array Before Moving Zeroes to End");

        System.out.print("{ ");
        for (int n : num) {
            System.out.print(n + " ");
        }System.out.println(" }");
        movezeros(num);

    }
    public static void movezeros(int[] num){
        for(int i=0;i<num.length;i++){
            if(num[i]==0){
                for(int j=i;j<num.length-1;j++){
                    num[j]=num[j+1];
                }
                num[num.length-1] = 0;
//                i--;
            }
        }
        System.out.println("Array After Moving Zeroes to End");
        System.out.print("{ ");
        for (int n : num) {
            System.out.print(n + " ");
        }System.out.println(" }");

    }
}
