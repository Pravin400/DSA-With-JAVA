package Strings.String_Problems;

public class StringCompareFunction {
    public static void main(String[] args) {
        // String literals -> stored in String Constant Pool (SCP)
        String a = "abcd";
        String b = "abcd";

        // Using 'new' keyword -> always creates a new String object in Heap memory
        String c = new String("abcd");

        // Printing values of strings
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        // --------------------------
        // Comparing with '==' operator
        // '==' checks REFERENCE (memory address), NOT content
        // a and b point to the same SCP object
        System.out.println("a == b");
        if (a == b) {
            System.out.println("Strings are the same");  // true -> same reference
        } else {
            System.out.println("Strings are not the same");
        }

        // a points to SCP, c points to Heap -> different objects
        System.out.println("a == c");
        if (a == c) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are not the same");  // false -> different references
        }

        // --------------------------
        // Comparing with '.equals()' method
        // equals() checks the actual CONTENT of the string
        if (a.equals(b)) {
            System.out.println("a.equals(b)");
            System.out.println("Strings are the same");  // true -> content is equal
        } else {
            System.out.println("Strings are not the same");
        }

        if (a.equals(c)) {
            System.out.println("a.equals(c)");
            System.out.println("Strings are the same");  // true -> content is equal
        } else {
            System.out.println("Strings are not the same");
        }

        // --------------------------
        // Comparing with 'compareTo()' method
        // compareTo() compares lexicographically (dictionary order)
        // Returns:
        //    0  -> both strings are equal
        //   <0  -> 'a' comes before 'c'
        //   >0  -> 'a' comes after 'c'
        System.out.println("a.compareTo(b) : " + a.compareTo(b)); // 0 (both are "abcd")
        System.out.println("a.compareTo(c) : " + a.compareTo(c)); // 0 (content equal)

        // Example with different strings
        String x = "apple";
        String y = "banana";
        System.out.println("x.compareTo(y) : " + x.compareTo(y)); // negative (-1) -> "apple" before "banana"
        System.out.println("y.compareTo(x) : " + y.compareTo(x)); // positive (+1) -> "banana" after "apple"
    }
}
