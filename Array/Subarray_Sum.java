package in.co.Array;

public class Subarray_Sum {
    public static void main(String[] args) {
        int numbers[] = {3,4,2,6,7,8};
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<numbers.length;i++){
            int start =i;
            for (int j=i;j<numbers.length;j++){
                int end = j;
                currsum =0;
                for (int k=start;k<=end;k++){
                    currsum += numbers[k];
                }
                System.out.println(currsum+" ");
                if (maxSum<currsum){
                    maxSum = currsum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
}
