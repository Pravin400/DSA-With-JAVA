package Arrays.Day002_Arrays;

public class Array_Argument {

    // Method to update each element of the array by adding 1
    public static void pass(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // Increment each mark by 1
        }
    }

    public static void main(String[] args) {
        // Declare and initialize an array of marks
        int[] marks = {98, 56, 56, 65};

        // Print the marks before updating
        System.out.println("Before Updating Marks : ");
        for (int arr : marks) {
            System.out.print(arr + " ");
        }

        // Update the array using the pass() method
        System.out.println("\nAfter Updating Marks : ");
        pass(marks); // Pass array to method (by reference)

        // Print the updated marks
        for (int arr : marks) {
            System.out.print(arr + " ");
        }
    }
}
