package in.co.Collection_List.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_ListAdd {
    public static void main(String[] args) {


        ArrayList<String> a1= new ArrayList<String>();

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter name: ");
//        String str = scan.next();
//
//        System.out.println("String: " + a1.add(str));
//
        a1.add("Geeks");
        a1.add("Geeks");

        a1.add(1,"for");
        System.out.println(a1);
    }
}
