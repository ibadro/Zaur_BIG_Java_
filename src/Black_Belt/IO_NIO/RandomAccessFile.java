package Black_Belt.IO_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile {
    public static void main(String[] args) {
        try (java.io.RandomAccessFile file = new java.io.RandomAccessFile("test45.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(101); // с поз 101 вывести строку на экран
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("FFFjjasdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffjj"); // Дописываем в 0 поз слово
            file.seek(file.length() - 1); // Дописывая в конец файла автора к примеру
            file.writeBytes("\n\t\t\t\t\t\t\t\t\tadsfasdf");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
