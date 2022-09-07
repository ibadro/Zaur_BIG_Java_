package Black_Belt.IO_NIO.Serializ.Progr2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializ2 {

        public static void main(String[] args) {
            List<String> employees;
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))) {
              employees =(ArrayList)  inputStream.readObject();
                System.out.println(employees);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

