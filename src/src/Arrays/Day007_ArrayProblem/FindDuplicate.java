package Arrays.Day007_ArrayProblem;

public class FindDuplicate {
    public static void main(String[] args) {

    int [] number = {1,3,4,2,2};

    Duplicate(number);
    }

    private static void Duplicate(int[] number) {
        int start = number[0];
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    System.out.println("Duplicate at index " + i + " " + j);
                    System.out.println("Duplicate Number is : ");
                    System.out.println(number[i] + " " + number[j]);
                    return;
                }

            }
        }
        System.out.println("No Duplicates found");
    }
}
