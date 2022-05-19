
package Lesson25;

public class Test1 {
    
    public static void main(String[] args) {
        
        Driver[] arr1 = {new Driver("Ben"), new Driver("Carl")}; // массив водителей
        // сюда идут только референс тип Driver
        
        Employee [] arr2 = {new Doctor("Petr"), new Teacher("Maria"), new Driver("Gavrik")};
        // в массив типа Employee я могу добавлять все рефренс типы данных, которые являются
        // детьми для Employee
        // new Employee обавить не могу . потому что класс абстрактный и не может иметь объектов
        Helpable [] arr3 = {new Doctor("Petr2"), new Teacher("Maria2"), new Driver("Gavrik2")};

        
        Employee emp1 = new Teacher("Teacher");
        Employee emp2 = new Driver("Driver");
        Employee emp3 = new Doctor("Doctor");
        // пример полиморфизма
        
//        emp1.work(); // Teacher works
//        emp2.work(); // Driver works
//        emp3.work(); // Doctor works

        Employee [] arr4 = {emp1, emp2, emp3}; 
        
        for(Employee emp:arr4){ // форич лупом вызываем метод ворд для каждого объекта типа Employee
            emp.work();
        }

        
        //в зависимости от типа, который вызывает метод ворк, он будет работать по-разному
        
        Helpable h = new Teacher("Helpful teacher");
        h.help(); // Helpful teacher helps
        // пример полиморфизма с интерфейсами
        
        // естественно при помощи h, я могу вызвать только те методы, которые 
        // находятся в интерфейсе Helpable
        
//        Helpable h2 = new Employee("Vasia");
// так сделать не могу, потому что класс абстрактный, то есть не может именть объектов
        
        Helpable h3 = new Driver("Gavr");
        h3.help(); // Gavr helps
//        h3.work(); // так сделать не могу потому что
// при помощи h, я могу вызвать только те методы, которые находятся в интерфейсе Helpable

    
        
        System.out.println(emp1 instanceof Teacher); // true
        System.out.println(emp1 instanceof Driver); // false
        System.out.println(emp1 instanceof Helpable); // true
        System.out.println(emp1 instanceof Employee); // true
        
        // является ли emp1 объектом Teacher или иного класса или же имеет ли связь
        // is a с классом или интерфейсом
        // да - тру, нет - фолс
        
        String s1 = null;
        System.out.println(s1 instanceof Object); // false
        // фолс , потому что нал - это НИЧТО
        System.out.println(null instanceof Object); // false
        
        
        Object o = new Object();
        System.out.println(o instanceof Employee); // false
        // не каждый объект - это эмплои, но каждый эмплои - объект
        

    }
    
}

abstract class Employee implements Helpable{ // вынужден сделать класс асбтрактным,тк он имеет абстрактный метод
    // вообще абстрактные методы создаются для того, чтобы для сабклассов родителя емплои
    // перезаписывать этот метод под свои нужно
    // напоминаю, что абстрактный класс НЕ МОЖЕТ ИМЕТЬ ОБЪЕКТА
    
    Employee(String name){
        this.name = name;
    }
    
    String name;
    
    void sleep(){
        System.out.println("Employee sleeps");
    }
    
    abstract void work();

}

class Teacher extends Employee implements Helpable{
    
    Teacher(String name){
        super(name);
        this.name = name;
    }
    
    public void work(){
        System.out.println(name + " works");
    }
    
    public void help(){
        System.out.println(name + " helps");
    }
    
}

class Driver extends Employee{
    
    Driver(String name){
        super(name);
        this.name = name;
    }
    
    public void work(){
        System.out.println(name + " works");
    }
    
    public void help(){
        System.out.println(name + " helps");
    }
    
}

class Doctor extends Employee{
    
    Doctor(String name){
        super(name);
        this.name = name;
    }
    
    public void work(){
        System.out.println(name + " works");
    }
    
    public void help(){
        System.out.println(name + " helps");
    }
    
}

interface Helpable{
    void help();
}