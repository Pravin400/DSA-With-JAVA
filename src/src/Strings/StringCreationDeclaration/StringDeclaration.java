package Strings.StringCreationDeclaration;

public class StringDeclaration {
    public static void main(String[] args) {
    // 1. Declaration without initialization
    String str1;
    str1 = "Hello";

    // 2. Declaration with initialization
    String str2 = "Java";

    // 3. Using new keyword
    String str3 = new String("World");

    // 4. Empty string
    String str4 = "";

    // 5. Null string (reference only, no object)
    String str5 = null;

    // Printing
    System.out.println(str1); // Hello
    System.out.println(str2); // Java
    System.out.println(str3); // World
    System.out.println(str4); // (blank)
    System.out.println(str5); // null
}
}
