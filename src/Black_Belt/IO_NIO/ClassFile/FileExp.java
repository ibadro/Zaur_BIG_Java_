package Black_Belt.IO_NIO.ClassFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExp {
    public static void main(String[] args) throws IOException {
        File file = new File("test55.txt");
        File file2 = new File("C:\\Users\\big-new\\Desktop\\q\\z.txt");
        File folder = new File("C:\\Users\\big-new\\Desktop\\q");
        File folder2 = new File("C:\\Users\\big-new\\Desktop\\a");

        System.out.println("file.getAbsolutePath" + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath" + folder.getAbsolutePath());
        System.out.println("--------------------------------------------");

        System.out.println("file.isAbsolute  " + file.isAbsolute());
        System.out.println("folder.isAbsolute  " + folder.isAbsolute());
        System.out.println("--------------------------------------------");

        System.out.println("file.isDirector  " + file.isDirectory());
        System.out.println("folder.isDirector  " + folder.isDirectory());
        System.out.println("--------------------------------------------");

        System.out.println("file.exists  " + file.exists());
        System.out.println("folder.exists  " + folder.exists());
        System.out.println("file2.exists  " + file2.exists());
        System.out.println("folder2.exists  " + folder2.exists());
        System.out.println("--------------------------------------------");

        System.out.println("file2.createNewFile  " + file2.createNewFile());
        System.out.println("folder2.mkdir  " + folder2.mkdir());
        System.out.println("--------------------------------------------");

        System.out.println("file2.length  " + file2.length());
        System.out.println("folder2.length  " + folder2.length());
        System.out.println("--------------------------------------------");

        System.out.println("file2.delete  " + file2.delete());
        System.out.println("folder2.delete  " + folder2.delete());
        System.out.println("--------------------------------------------");

        File[] files =folder.listFiles();

        System.out.println(Arrays.toString(files));
        System.out.println("--------------------------------------------");

        System.out.println("file2/isHiden "+ file2.isHidden());

        System.out.println("--------------------------------------------");

        System.out.println("file2 Read  "+ file2.canRead());
        System.out.println("file2 canWrite "+ file2.canWrite());
        System.out.println("file2 canExecute "+ file2.canExecute());


    }

}
