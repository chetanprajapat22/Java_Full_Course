package in.co.Comparable_Comparator;

import java.util.Comparator;

public class orderByName implements Comparator<Marksheet> {
    public int salary;

    @Override
    public int compare(Marksheet m1, Marksheet m2) {
        return m1.name.compareTo(m2.name);
    }
}
