package Strings.String_Problems;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.toString());
    }
}
