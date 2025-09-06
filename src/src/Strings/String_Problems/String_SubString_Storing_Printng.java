package Strings.String_Problems;

public class String_SubString_Storing_Printng {
    public static void main(String[] args) {

    //Substring
    String str = "Hello World";

    int start = 0;
    int end = 5;
        //with created function
        System.out.println(substring(str,start,end));
        //with in build function
        System.out.println(str.substring(start,end));
    }
    public static String substring(String str,int start,int end){
        String substring = "";
        for(int i=start;i<end;i++){
            substring += str.charAt(i);
        }
        return substring;
    }
}



