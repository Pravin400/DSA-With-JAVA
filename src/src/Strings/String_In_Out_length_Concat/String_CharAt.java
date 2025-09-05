package Strings.String_In_Out_length_Concat;

public class String_CharAt {
    public static void main(String[] args) {
        String firstname = "Tony";
        String lastName = "Stark";
        String fullname = firstname+lastName;
        String setWovels = "aeiou";
        printletter(fullname);
        printwovels(fullname,setWovels);

    }
    public static void printletter(String str ){
        for( int i=0; i<str.length(); i++ ){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void printwovels(String str,String wovels){
        for( int i=0; i<str.length(); i++ ){
            for(int j=0; j<wovels.length(); j++ ){
                if(str.charAt(i)==wovels.charAt(j)){
                    System.out.print(str.charAt(i)+" ");
                }
            }
        }
    }


}
