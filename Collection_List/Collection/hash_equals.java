//package in.co.Collection_List.Collection;
//
//import in.co.Abstraction.Employee;
//
//public class hash_equals {
//    int id;
//    String name;
//    int Salary;
//
//    public hash_equals(int id , int Salary , String name){
//        this.id = id;
//        this.Salary = Salary;
//        this.name= name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public int getSalary() {
//        return Salary;
//    }
//
//    public boolean hash_equals(Object obj) {
//        if(obj== null){
//            return false;
//        }if(!(obj instanceof Employee)){
//            return false;
//        }
//        Employee e = (Employee) obj;
//        boolean b = this.id && this.name && this.Salary ;
//    }
//}
