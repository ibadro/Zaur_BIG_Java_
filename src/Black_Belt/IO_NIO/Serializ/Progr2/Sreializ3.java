package Black_Belt.IO_NIO.Serializ.Progr2;

import Black_Belt.IO_NIO.Serializ.Progr2.Progr1.Emloyee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Sreializ3 {
    public static void main(String[] args)   {
        Emloyee bestemloyee;
        try (ObjectInputStream inputStream =new ObjectInputStream(new FileInputStream("employees1.bin"))){
            bestemloyee= (Emloyee) inputStream.readObject();
            System.out.println(bestemloyee);
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
