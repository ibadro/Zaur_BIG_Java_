package Alishev;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person pers1 = new Person();
        pers1.setNameAndAge("Iv",50);
       // pers1.calcYearsToPencia();
        Person pers2 = new Person();
        String s1 = "Vova";
        pers2.setNameAndAge(s1,30);

        pers1.speak();
        pers2.speak();



    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage ){
        name = username;
        age = userage;
    }

    void speak() {
      //  for (int i = 0; i < 3; i++) { // три раза выводим на экран
            System.out.println("i am " + name + "," + age + "let");      //  }


        }
    void sayHello() {
        System.out.println(" hello");
    }
    int calcYearsToPencia(){
        int years = 65- age;
        //System.out.println(" кол-во лет до пенсии" + eyears);
        return years; // возвращает и мгновенно выходит из метода

    }
}
