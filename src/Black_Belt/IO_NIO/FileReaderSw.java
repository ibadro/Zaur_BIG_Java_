package Black_Belt.IO_NIO;

import java.io.IOException;
import java.io.FileReader;


public class FileReaderSw {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("test55.txt");
            int character;
            while ((character = reader.read(  )) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("DOne");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
