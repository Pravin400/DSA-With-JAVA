package Strings.String_Problems;

public class String_Compression {
    public static void main(String[] args) {
        String str = "aaabbbbbbbbcccd";
        compression(str);
    }

    // Method to compress the string
    private static void compression(String str) {
        StringBuilder sb = new StringBuilder();

        int count = 1; // count occurrences of each char
        for (int i = 0; i < str.length(); i++) {

            // Check if next char is same (only if not at last char)
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append current character
                sb.append(str.charAt(i));

                // Append count only if greater than 1
                if (count > 1) {
                    sb.append(count);
                }

                // Reset count
                count = 1;
            }
        }

        System.out.println("Original String  : " + str);
        System.out.println("Compressed String: " + sb.toString());
    }
}
