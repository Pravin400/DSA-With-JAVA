package Strings.String_Problems;

public class String_PrintLargest {
    public static void main(String[] args) {
        // Array of strings
        String fruits[] = {"apple", "Banana", "mango", "Orange", "grapes"};

        // Assume first element is largest initially
        String largest = fruits[0];

        // ================= Using compareTo() =================
        // compareTo() → Compares two strings lexicographically (dictionary order)
        // - Returns 0 → if strings are equal
        // - Returns negative → if current string < compared string
        // - Returns positive → if current string > compared string
        for (int i = 0; i < fruits.length; i++) {
            // If "largest" is smaller than current fruit, update largest
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Largest (case-sensitive using compareTo) : " + largest);

        // ================= Using compareToIgnoreCase() =================
        // compareToIgnoreCase() → Same as compareTo but ignores case (A == a)
        // This is useful when we don’t want uppercase/lowercase to affect comparison
        String largestIgnoreCase = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largestIgnoreCase.compareToIgnoreCase(fruits[i]) < 0) {
                largestIgnoreCase = fruits[i];
            }
        }

        System.out.println("Largest (case-insensitive using compareToIgnoreCase) : " + largestIgnoreCase);
    }
}
