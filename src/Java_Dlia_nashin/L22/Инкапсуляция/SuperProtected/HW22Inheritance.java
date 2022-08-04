
package Java_Dlia_nashin.L22.Инкапсуляция.SuperProtected;

public class HW22Inheritance {
    /*aaaaaaa1
Создайте класс Анимал. Прие вызове его конструктора пусть на экран выводится "I am animal". В классе пусть будет переменная eyes, характерихующая колличество глаз;
методы eat(выводящий на экран "Animals Eats" и drink (выводящий на экран "animal drinks").
Создайте класс Pet?, который является child классом класса Animal. При вызове его конструктора пусть на жкран выводится "I am pet"  ии перменной eyes придается значение 2.
В классе пусть булет переменных name, Tail, характеризующая количество хвостов и равная 1; paw, характеризующая количество лап и равная 4;
методы run( выводящий на экран "Pet runs") b jump (выводящий на экран "Pet jumps").
Создайте класс Dog который является child классом Pet. При вызове его конструктора с параметрам, который будет передавать имя, пусть на экран
выводится "I am dog and my name is:"+ имя питомца. В классе добавьте метод play (выводящий на экран "Dog plays")
Создайте класс Cat который является child классом Pet. При вызове его конструктора с параметрам, который будет передавать имя, пусть на экран
выводится "I am cat and my name is:"+ имя питомца. В классе добавьте метод sleep (выводящий на экран "Cat sleeps")
Сщздайте класс Test, в методе main которого вывидите на экран количество лап обьекта класса Dog и вызовите sleep оббьекта класса Cat.
 */
}
class Animal{

    Animal(){
        System.out.println("I am animal");
    }
    int eyes;
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animal drinks");
    }
}
class Pet extends Animal{
    Pet(){
        eyes = 2;
        System.out.println("I am Pet");
    }
    String name;
    int tail = 1;
    int paw = 4;
    void run(){
        System.out.println("Pet runs");
    }
    void jump(){
        System.out.println("Pet jumps");
    }
}
class Dog extends Pet{
    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }
    void play(){
        System.out.println("Dog plays");
    }
}
class Cat extends Pet{
    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }
    void sleep(){
        System.out.println("Cat sleeps");
    }
}
class HWTest{
    public static void main(String[] args) {
        Dog doggyDog = new Dog("Scoob");
        System.out.println(doggyDog.paw);
        Cat kittyCat = new Cat("Karl");
        kittyCat.sleep();
    }
}