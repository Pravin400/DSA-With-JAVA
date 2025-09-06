package Strings.String_Problems;

public class String_SubString_Printng {
    public static void main(String[] args) {

    //Substring
    String str = "Hello World";

    int start = 0;
    int end = 5;
    substring(str,start,end);
    }
    public static void substring(String str,int start,int end){
        for(int i=start;i<end;i++){
            System.out.print (str.charAt(i));
        }
    }
}



