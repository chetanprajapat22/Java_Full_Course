package in.co.Array;

public class LinearSearch {

    public static int search(int number[],int key){
        for (int i=0;i<number.length;i++){
            if (number[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number [] = { 1,23,45,67,75,6,7,34,56};
        int key = 75;

        int index = search(number,key);
        if (index==-1){
            System.out.println("Not Found");
        }else {
            System.out.println("key is found at index:" + index);
        }

    }
}
