package Alishev.Equals1;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1== animal2);
        System.out.println(animal1.equals(animal2));

        String st1 = "hel";
        String st2 = "hel";
        System.out.println(st1.equals(st2));


    }
}

class Animal {
    int id;
public Animal(int id){
    this.id= id;



}
public boolean equals(Object obj){
    Animal otherAnimal = (Animal) obj;
    return this.id == otherAnimal.id;

}
}