package in.co.Collection_List.Collection;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {

        int n=5;
        String s= "chetan";
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<String> str1 = new ArrayList<String>();

        System.out.println("Array 1: " + arr1);
        System.out.println("Array 2: " + arr2);
        System.out.println("String : " + str1);

        for (int i=1;i<=n;i++){
            arr1.add(i);
            arr2.add(i);
            str1.add(String.valueOf(s));
        }
        System.out.println("Array 1: " + arr1);
        System.out.println("Array 2: " + arr2);
        System.out.println("String : " + str1);
    }
}
