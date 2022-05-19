
package Lesson24;

public class Test3{
 
    public static void main(String[] args) {
        
//        Help_able hA = new Help_able();
// НЕВОЗМОЖНО СОЗДАТЬ ОБЪЕКТ ИНТЕРФЕЙСА, ТК ЭТО НЕ КЛАСС
// у интерфейсов НЕТ КОНСТРУКТОРОВ

        Swim_able sw = new Driver(); // можно создать переменную типа данных Swim_able (интерфейс)
        Employee e = new Driver();
//        e. // можно обращаться только к тому, что есть в классе емплои

        System.out.println(sw.tries); // 5
        // через переменную типа данных интерфейса мы может обратиться только к тому, что лежит в интерфейсе
        // через нее мы не можем увидеть, что лежит в драйвере или емплои
        
        // компилятор смотрит переменная sw какому типу данных принадлежит?
        // Swim_able
        // что лежит в Swim_able?
        // то мы и можем выводить, а это константа tries и метод swim
        
        sw.swim(); // Driver swims
        // почему драйверс?
        // потому что sw типа данных Swim_able ссылается на объект класса Driver
        
        
    }
    
}

class Employee{
    
    int salary = 1000;
    String name = "Nekolya";
    int age;
    int experiance;

    void eat() {
        System.out.println("Employee eats");
    }
    
    void sleep() {
        System.out.println("Employee wants to sleap");
    }
    
}

class Driver extends Employee implements Help_able,Swim_able{ // можно подключать несколько(сколько-угодно) интерфейсов через запятую

    String nameOfCar;
    
    void drive(){
        System.out.println("drive");
    }
    
@Override // добавление аннотации   
    public void pogat(){ // необходимо сделать метод пабликом,тк бай дефолт все методы интерфейса - ПАБЛИК
        System.out.println("Driver pomogat");
    }
@Override // добавление аннотации    
    public void tushit(String s){ // необходимо сделать метод пабликом,тк бай дефолт все методы интерфейса - ПАБЛИК
        System.out.println("Driver tushit pozhar s pomosju " + s);
    }
@Override
    public void swim(){
       System.out.println("Driver swims"); 
    }
    
}

class Teatcher extends Employee implements Help_able{ // подключаем интерфейс к тычеру
// класс с подключенным интерфейсом нужно либо сделать абстрактным , либо добавить в него 
// абстрактные методы, которые хранятся в интерфейсе Help_able
    int pupilsCount;
    
    void teach(){
        System.out.println("teach");
    }
@Override // добавление аннотации   
    public void pogat(){ // необходимо сделать метод пабликом,тк бай дефолт все методы интерфейса - ПАБЛИК
        System.out.println("teacher pomogat");
    }
@Override // добавление аннотации    
    public void tushit(String s){ // необходимо сделать метод пабликом,тк бай дефолт все методы интерфейса - ПАБЛИК
        System.out.println("teacher tushit pozhar s pomosju " + s);
    }
    
}
// создание интерфесов
// by default все методы внутри интерфейсов public abstract!!!!!
interface Help_able{ // аксесс модефаер у интерфейса может быть или паблик, или дефолт
    
    void pogat(); // интерфейс может содержать только абстактные методы, а абстактные методы не содержат бади
    void tushit(String predmet); // интерфейс может содержать только абстактные методы, а абстактные методы не содержат бади
    
}

interface Swim_able{
    public final static int tries = 5;   // переменные внеутри интерфейса могут быть ТОЛЬКО КОНСТАНТЫМИ
    void swim(); // интерфейс может содержать только абстактные методы, а абстактные методы не содержат бади
}