package Black_Belt.IO_NIO;

import java.io.*;
import java.lang.module.FindException;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test55.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test33.txt"));) {
//            int character;
//            while ((character = reader.read()) != -1)
//            {
//                writer.write(character);
//            }
            String line;
            while ((line=reader.readLine())!= null){
                writer.write(line);
                writer.write('\n'); // чтобы переносить строки
            }
            System.out.println("done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

