package in.co.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
    public static void main(String[] args) {

        ArrayList m =new ArrayList();
        m.add(new Marksheet("A4","Chetan",89,5000));
        m.add(new Marksheet("A3","Vishal",88,1000));
        m.add(new Marksheet("A5","vishal",80,1200));
        m.add(new Marksheet("A1","Arjun",96,12000));
        m.add(new Marksheet("A2","Deepak",77,1234));

       orderByName cName = new orderByName();
       Collections.sort(m,cName);

        OrderByMarksDesc cMarks =  new OrderByMarksDesc();
        Collections.sort(m,cMarks);

        Salary sSalary = new Salary();
        Collections.sort(m,sSalary);

        Collections.sort(m);

        for (Object o: m){
            System.out.println(o);
        }
    }
}
