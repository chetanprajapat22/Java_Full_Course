package in.co.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinaryFile {
    public static void main(String[] args) throws IOException {

        String source = "C:\\Users\\cheta\\Downloads\\julius-drost-pYAvBZvplOM-unsplash.jpg";
        String target = "C:\\Users\\cheta\\Downloads\\julius-drost-pYAvBZvplOM-unsplash2.jpg";


        FileInputStream in = new FileInputStream(source);
        FileOutputStream out = new FileOutputStream(target);
        
        int ch = in.read();
        
        while (ch!= -1){
            out.write(ch);
            ch= in.read();
        }
        in.close();
        out.close();
        System.out.println(source+ "is copied to" + target);
        
    }
}
