package Alishev.ЗаписьВфайл.Серилизация;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        //   Person person1 = new Person(1, "bob");
        //    Person person2 = new Person(2, "rod");
        Person[] people = {new Person(1, "bob"), new Person(3, "rob"), new Person(4, "ali")};
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            oos.writeObject(person1);
//            oos.writeObject(person2);
            oos.writeInt(people.length);

            for (Person person : people) {
                oos.writeObject(person);
            }
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
