package in.co.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFor {
    public static void main(String[] args) throws ParseException {

        Date today = new Date() ;

        SimpleDateFormat format1= new SimpleDateFormat("dd/mm/yy");

        String strDate = format1.format(today);
        System.out.println("Format#1 : " + strDate);

        Date pDate = format1.parse("15/08/2023");
        System.out.println(pDate);
    }
}
