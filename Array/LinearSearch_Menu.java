package in.co.Array;

public class LinearSearch_Menu {

    public static int MenuSearch(String menu[],String key){
        for (int i=0;i<menu.length;i++){
            if (menu[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu [] = {"Dosa","Chola","kachori","poha","poha","Noodles"};
        String key = "poha";

        int index= MenuSearch(menu,key);
        if (index==-1){
            System.out.println("not found");
        }else {
            System.out.println("key at found at index: " + index);
        }

    }
}
