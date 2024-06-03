package in.co.DateFormat;

import java.text.DateFormat;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        DateFormat DFormat = DateFormat.getDateInstance();

        Calendar cal = Calendar.getInstance();

        System.out.println("The original date: " + cal.getTime());

        String Curr_date = DFormat.format(cal.getTime());
        System.out.println("Formatted Date: " + Curr_date);
    }
}
