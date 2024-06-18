package in.co.Array;

public class BinarySearch {

    public static int binarySearch(int number[],int key){
        int start = 0,end=number.length-1;

        while (start<=end){
            int mid = (start+end)/2;

            //comparisions
            if (number[mid]==key){
                return mid;
            }
            if (number[mid]<key){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {23,34,43,23,34,34,54,567,787};
        int key = 34;
        System.out.println("index of key is : " + binarySearch(numbers,key));

    }
}
