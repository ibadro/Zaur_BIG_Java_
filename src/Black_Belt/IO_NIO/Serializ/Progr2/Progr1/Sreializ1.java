package Black_Belt.IO_NIO.Serializ.Progr2.Progr1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Sreializ1 {
    public static void main(String[] args)   {
        List<String> employees = new ArrayList ();
        employees.add("zaur");
        employees.add("nur");
        employees.add("ilnur");
        try (ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream("employees1.bin"))){
            outputStream.writeObject(employees);
            System.out.println("done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
