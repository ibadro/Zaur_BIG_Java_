package Ot_prostogo.z1.OOP;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.getDogsCount());
        Dog lab = new Dog();
        lab.setHvost(1);
        lab.setLapi(3);
        lab.setName("sharic");
        lab.setPoroda("dvooterer");
        lab.setSize("big");

        Dog shep= new Dog();
        shep.setHvost(1);
        shep.setLapi(4);
        shep.setName("shar");
        shep.setPoroda("dvooterer");


        System.out.println(lab.getName() + lab.getPoroda());
    }
}