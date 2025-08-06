package Arrays.Day002_Arrays;

public class Array_Linear_Search {

    // Function to perform linear search
    public static String linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println(key + " is found at index " + i);
                return "true";
            }
        }
        System.out.println(key + " not found in the array.");
        return "false";
    }

    public static void main(String[] args) {
        int[] numbers = {9, 8, 5, 16, 55, 61, 6, 15};
        int key = 550;

        // Call the function and store result
        String result = linearSearch(numbers, key);

        // Optional: Print final result
        System.out.println("Search Result: " + result);
    }
}
