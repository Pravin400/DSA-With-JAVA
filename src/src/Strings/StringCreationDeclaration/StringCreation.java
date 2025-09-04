package Strings.StringCreationDeclaration;

public class StringCreation {
    //1.java strings are immutable means cannot be change
    //2.String Creation Using String Literals
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(str1 );


    //3.means her have String constant pool(scp) string literal stored in that and another string with same value java can reuse it
        String a = "Java";
        String b = "Java";
        System.out.println(a == b);  // true (same memory reference from SCP)


    //4.String Creation Using new KeyWord
    //5.A new object is created in the heap memory, even if "java" already exists in SCP.
    //6.So, it will not reuse memory.
        String str2 = new String("Hello World");
        String aa = new String("java");
        String bb = new String("java");
        System.out.println(aa == bb);// false (different objects in heap)



    }
}
