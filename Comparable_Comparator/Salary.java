package in.co.Comparable_Comparator;

import java.util.Comparator;

public class Salary  implements Comparator<Marksheet> {

    @Override
    public int compare(Marksheet m1, Marksheet m2) {
        if (m1.salary> m2.salary){
            return -1;
        } else if (m1.salary== m2.salary) {
            return 0;
        }else {
            return 1;
        }
    }
}
