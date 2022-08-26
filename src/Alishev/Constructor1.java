package Alishev;

public class Constructor1 {
    public static void main(String[] args) {
        Human1 human5 = new Human1( );


    }
}

class Human1 {
    private String name;
    private int age;

    public Human1() {
        this.name = "imia po umolsh";
        this.age =0;
    }

    public Human1(String name, int age) {
        System.out.println(" Привет из 2 конструктора ");
        this.name = name;
        this.age = age;
    }

    public Human1(int age) {
        System.out.println(" Привет из 3 конструктора ");
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}