package in.co.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args)throws IOException {

        FileOutputStream file = new FileOutputStream("C:\\Desktop\\Chetan.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);

        Result r= new Result();
        r.name = "Ram";
        r.physics= 89;
        r.chemistry = 99;
        r.maths =95;

        out.writeObject(r);
        out.close();
        file.close();


    }
}
