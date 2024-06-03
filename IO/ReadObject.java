package in.co.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws Exception {

        FileInputStream file = new FileInputStream("C:\\Desktop\\Chetan.txt");
        ObjectInputStream in = new ObjectInputStream(file);

        Result r = (Result) in.readObject();

        System.out.println(r.name);
        System.out.println(r.physics);
        System.out.println(r.chemistry);
        System.out.println(r.maths);

        in.close();
        file.close();

    }
}
