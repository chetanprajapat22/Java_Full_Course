package in.co.String;

public class SubString {
    public static String sub_String(String str,int si,int ei){
        String substr ="";
        for (int i=si; i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(sub_String(str,0,5));
    }
}
