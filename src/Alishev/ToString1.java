package Alishev;

public class ToString1 {
    public static void main(String[] args) {
        Human111 h1= new Human111("bob ",55);
        h1.toString();
        System.out.println(h1);
    }
}
class Human111{
    private String name;
    private int age;

    public Human111(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  String toString(){
        return name+ " "+age;
        // переопределили tostring
    }
}
