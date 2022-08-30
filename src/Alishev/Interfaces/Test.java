package Alishev.Interfaces;

public class Test {
    public static void main(String[] args) {
//     Info info1= new Animal(1);
//     Info info2= new Person(" bob");
//     info1.showInfo();
//     info2.showInfo();
        Animal animal1 =new Animal(2);
        Person person1 = new Person("sdf");
outputInafo(animal1);
outputInafo(person1);

    }

    public static void outputInafo(Info info){
        info.showInfo();
    }
}
