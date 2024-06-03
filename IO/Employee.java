package in.co.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

    public String id= null;
    public String firstName = "chetan";
    public String lastName= null;
    public  double salary = 0;


    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        id = (String) in.readObject();
        firstName =(String) in.readObject();
        lastName=(String) in.readObject();
        salary =in.readDouble();

    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(id);
        out.writeObject(firstName);
        out.writeObject(lastName);
        out.writeDouble(salary);

    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.firstName);

    }

}
