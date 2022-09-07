package Black_Belt.IO_NIO.Serializ.Progr2.Progr1;

import java.io.Serializable;

public class Emloyee implements Serializable {
    static final long serialVersioUID =2;

    String name;
    String surname;
    String departament;
    //  int age;
    transient double salary;
    Car car;

    public Emloyee(String name,
                   String surname,
                   String departament,
                   //  int age,
                   double salary,
                   Car car
    ) {
        this.name = name;
        this.surname = surname;
        this.departament = departament;
        //  this.age = age;
        this.salary = salary;
        this.car = car;


    }

    @Override
    public String toString() {
        return "Emloyees{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", departament='" + departament + '\'' +
                //     ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
