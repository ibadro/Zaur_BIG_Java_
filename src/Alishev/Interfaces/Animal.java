package Alishev.Interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }
    public void showInfo(){
        System.out.println(this.id);
    }



    public void sleep(){
        System.out.println(" i am sleping ");
    }
}
