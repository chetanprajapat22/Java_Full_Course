package in.co.Comparable_Comparator;

public class Marksheet implements Comparable<Marksheet>{

    public String rollno;
    public String name;
    public int  marks;
    public int salary;
    public Marksheet(String rollno,String name,int marks ,int salary){
        this.rollno= rollno;
        this.name =name;
        this.marks= marks;
        this.salary = salary;

    }
    @Override
    public int compareTo(Marksheet m) {
        return rollno.compareTo(m.rollno);
    }
    public String toString(){
        return rollno+","+name+","+marks+","+salary;
    }
}
