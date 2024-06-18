package in.co.Array;

public class LargestElement {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value are: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number [] = {12,34,56,67,76,57,43,43,32,56,77};
        System.out.println("largest value is: " + getLargest(number));

    }
//public static void main(String[] args) {
//    int number [] = {12,4,43,55,66,87,66,89,675,56,454};
//
//    int largest = number[0];
//
//    for (int i=0;i<number.length;i++){
//        if (number[i]>largest){
//            largest= number[i];
//        }
//    }
//    System.out.println("the largest element are : " + largest);
//}
}
