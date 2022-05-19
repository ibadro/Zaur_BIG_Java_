
package Lesson8;


public class Student1 {
    
    String name;
    int course;
    static int count; // для нее выделяется место в памяти не связанное с объектами, А СВЯЗАННОЕ С САМИМ КЛАССОМ!
    int a;
    
    
    public Student1(String name1, int course1) {
        
        count++;
        name = name1;
        course = course1;
        System.out.println("Student " + count + " is created!");
    
    }
    
    public static void main(String[] args) {
        
        Student1 st1 = new Student1("Ivan", 1);
        Student1 st2 = new Student1("Igor", 3);
        Student1 st3 = new Student1("Dima", 2);
        
        System.out.println("******");
        System.out.println(count); // потому что я нахожусь в самом классе
        // которому принадлежит переменная
        showCount(); // Count number is: 3
        // не присваиваем метод шоукант какому-то объекту
        // тк showCount - статик и находится внутри класса которому принадлежит
        Student1.showCount(); // Count number is: 3
        st1.showCount(); // Count number is: 3
        // это абсолютно тоже самое, тк, мы обращаемся к методы объекта
        adcdv();
        
    }     
        
    public static void showCount() {
    
        System.out.println("Count number is: " + count);
    
    }
    
    public void showInfo() {
    
        System.out.println("welcome to class Student1 ");    
        
    }
    
    void abc() {
    
        a++; // принадлежит не классу целиком, а каждому объекту,
        // то есть у каждого объкта есть своя а, которая увеличивается на 1
        count++; // статичные переменные можно юзать где-  угодно
        
    }
    
    static void abcd() {
    
        // a++; // внутри стачичного метода использовать не могу инстанс переменную
        count++; // статичные переменные можно юзать где-  угодно
        
    }
    // компилятор запрещает использовать нон статик переменные внутри статик методов
    // тк это означает, что мы используем переменную объкта, который еще не создан, что в принципе не поддается никакой логике
    
    static void adcdv() {
    
        count++; // статичные переменные можно юзать где-  угодно
        Student1 st5 = new Student1("valerchik", 3);
        st5.a++;
        // то есть , чтобы заюзать инстанс переменную, нам нужен объект
        // которому будет принадлежать эта переменная
        // в данном случае объекту ст5 принадлежит инстанс переменная а
        // мы ее увеличиваем на 1 ВНУТРИ СТАТИК МЕТОДА!!!!
        System.out.println(st5.a);
        System.out.println(st5.name);
        
    }
    
    
    
}


