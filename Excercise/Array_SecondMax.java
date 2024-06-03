package in.co.Excercise;
//
public class Array_SecondMax {
    public static void findSecondLargest(int[] nums) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest) {
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);
    }

    public static void main(String[] args) {
        int[] nums = {12,34,56,87,987,};
        Array_SecondMax.findSecondLargest(nums);

    }
}
