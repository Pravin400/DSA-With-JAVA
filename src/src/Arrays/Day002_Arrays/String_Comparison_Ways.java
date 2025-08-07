package Arrays.Day002_Arrays;

import java.util.Objects;
import java.util.Scanner;

import static Arrays.Day002_Arrays.Array_Linear_Search_HotelMenu.display;

public class String_Comparison_Ways {
    public static void main(String[] args) {

        // Array of sample menu items (unsorted & mixed case)
        String[] menu = {"Dosa", "Chole", "samosa", "Misal", "Tea"};
        System.out.println("Menu : ");
        display(menu);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order : ");
        // Target string to compare
        String userInput = sc.next();

        System.out.println("🔍 Target Item: " + userInput);
        System.out.println("----------------------------------");

        // 1️⃣ Using compareTo()
        // ➤ Compares strings lexicographically (case-sensitive)
        // ➤ user need enter exact spelling(lower case == lowercase/uppercase == uppercase/lowercase != uppercase of the food item
        System.out.println("Using compareTo() [case-sensitive]:");
        for (String item : menu) {
            if (userInput.compareTo(item) == 0) {
                System.out.println("✅ Match found: " + item);
            } else {
                System.out.println("❌ No match: " + item);
            }
        }
        System.out.println("----------------------------------");

        // 2️⃣ Using compareToIgnoreCase()
        // ➤ Lexicographical comparison, but case-insensitive
        // ➤ only spelling have to be correct  lowercase uppercase all of that acceptable
        System.out.println("Using compareToIgnoreCase() [case-insensitive]:");
        for (String item : menu) {
            if (userInput.compareToIgnoreCase(item) == 0) {
                System.out.println("✅ Match found: " + item);
            } else {
                System.out.println("❌ No match: " + item);
            }
        }
        System.out.println("----------------------------------");

        // 3️⃣ Using Objects.equals()
        // ➤ Safe null-aware comparison using equals() internally
        System.out.println("Using Objects.equals() [case-sensitive]:");
        for (String item : menu) {
            if (Objects.equals(userInput, item)) {
                System.out.println("✅ Match found: " + item);
            } else {
                System.out.println("❌ No match: " + item);
            }
        }
        System.out.println("----------------------------------");

        // 4️⃣ Using matches() with regex
        // ➤ Pattern-based comparison (case-insensitive with (?i) flag)
        System.out.println("Using matches() with regex [case-insensitive]:");
        for (String item : menu) {
            if (item.matches("(?i)" + userInput)) { // (?i) = case-insensitive
                System.out.println("✅ Match found: " + item);
            } else {
                System.out.println("❌ No match: " + item);
            }
        }
        System.out.println("----------------------------------");

        // 5️⃣ Using == operator
        // ➤ Compares memory references (not content), unreliable for strings
        System.out.println("Using == operator [reference comparison, not reliable]:");
        for (String item : menu) {
            if (userInput == item) {
                System.out.println("✅ Match found (same reference): " + item);
            } else {
                System.out.println("❌ No match (different object): " + item);
            }
        }
        System.out.println("----------------------------------");
    }
}
