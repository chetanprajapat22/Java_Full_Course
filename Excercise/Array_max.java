package in.co.Excercise;

public class Array_max {

    public static void Method(int arr[]){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("the max of array: " + max);
    }

    public static void main(String[] args) {
        int [] arr = {12,34,56,78,90,44,345,56457,232,77777};
        Array_max.Method(arr);
    }
}
