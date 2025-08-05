package Arrays.Day001_Arrays;

/**
 * Day001 - Array Creation Only
 * This class shows different ways to declare and create arrays in Java.
 */
public class Array_Creation {
    public static void main(String[] args) {

        // Declaration only (no memory allocated)
        int[] a;         // Java style (preferred)
        int b[];         // C/C++ style (valid but not recommended)

        // Multiple declarations
        int[] x, y;      // Both x and y are arrays
        int m[], n;      // m is array, n is just int ❗

        // Declaration + memory allocation (size 50, default = 0)
        int[] marks = new int[50];

        // Declaration + initialization with values
        int[] numbers = {1, 2, 3, 4, 5};

        // String array example
        String[] extraData = {"10", "20", "Mahesh", "Babu", "King"};

        // ⚠️ No printing, no logic — only array creation is handled here
    }
}
