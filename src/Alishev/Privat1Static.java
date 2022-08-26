package Alishev;

public class Privat1Static {
    public static void main(String[] args) {
        Human10 h5 = new Human10("ror", 34);
        Human10 h6 = new Human10("hr", 66);
        h6.printNmbOfPeole();
        h5.printNmbOfPeole();
    }
}

class Human10 {
    private String name;
    private int age;
    private static int countPeople;


    public Human10(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNmbOfPeole() {
        System.out.println(countPeople);
    }
}

