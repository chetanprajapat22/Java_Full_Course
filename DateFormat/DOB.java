package in.co.DateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your BirthYear: ");
        int BirthYear = sc.nextInt();

        LocalDate currentDate = LocalDate.now();


//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
//        System.out.println(formatter.format(currentDate));
//
        int currentYear = currentDate.getYear();
        int age = currentYear-BirthYear;
        System.out.println("current age:  " + age);
    }
}
