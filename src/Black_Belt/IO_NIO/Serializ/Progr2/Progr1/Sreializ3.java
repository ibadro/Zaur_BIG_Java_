package Black_Belt.IO_NIO.Serializ.Progr2.Progr1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sreializ3 {
    public static void main(String[] args)   {
        Car car = new Car("nis","red");
        Emloyee emloyee = new Emloyee("mari","ivanova","it",500 , car);

        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("employees1.bin"))){
            outputStream.writeObject(emloyee);
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
