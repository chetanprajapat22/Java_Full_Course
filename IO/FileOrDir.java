package in.co.IO;

import java.io.File;
import java.util.Date;

public class FileOrDir {
    public static void main(String[] args) {

        File f = new File("C:\\Desktop\\Chetan.txt\\");

        if (f.exists()) {
            System.out.println("Name: " + f.getName());
            System.out.println("Path: " + f.getPath());

            System.out.println("Access permission");
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());

            System.out.println("Is file: " + f.isFile());
            System.out.println("is Dir: " + f.isDirectory());

            Date d = new Date(f.lastModified());

            System.out.println("Date Modified: " + d);

            long length = f.length();
            System.out.println("Length: " + length + "bytes");
        }else {
            System.out.println("File does not exists");
        }

//        File directory = new File("C:\\Desktop\\Chetan.txt\\");
//
//        String [] files = directory.list();
//        for (String f: files){
//            System.out.println(f);
//            File subdir = new File(directory,"test");
//            subdir.mkdir();
//        }
    }
}
