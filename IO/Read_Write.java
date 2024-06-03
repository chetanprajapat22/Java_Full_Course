package in.co.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Write {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("C:\\Desktop\\Chetan.txt");

//        int ch = reader.read();
////        char chr;
//
//        while (ch!= -1){
//            System.out.print((char)ch);
//            ch = reader.read();
//        }
//        reader.close();


        /// Read by Read line**********

        BufferedReader br = new BufferedReader(reader);

        String line = br.readLine();
        while (line !=null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
