package in.co.Soritng;

public class Selection_Sort {

    public static void selectionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){

            int minPos =i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minPos]>arr[j]){
                    minPos =j;
                }
            }
            //swap

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;
        }
    }
    public static void printArray(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {55,43,45,43,34,1314};
        selectionSort(arr);
        printArray(arr);
    }
}
