package Alishev.ЗаписьВфайл.Серилизация;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ResdObject {
    public static void main(String[] args) throws IOException {


        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

//            Person person1 = (Person) ois.readObject();
//            Person person2 = (Person) ois.readObject();
            int personcount = ois.readInt();
            Person[] people = new Person[personcount];

            for (int i = 0; i < personcount; i++)
                people[i] = (Person) ois.readObject();
            System.out.println(Arrays.toString(people));

//            System.out.println(person1);
//            System.out.println(person2);
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
