package Black_Belt.IO_NIO;

import java.io.*;

public class CopyExImage {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\big-new\\Desktop\\75BC5A20.PNG");
             FileOutputStream outputStream = new FileOutputStream(("75BC5A20.PNG"));) {
            int i;

            while ((i=inputStream.read()) != -1) {
            outputStream.write(i);

            }
            System.out.println("done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
