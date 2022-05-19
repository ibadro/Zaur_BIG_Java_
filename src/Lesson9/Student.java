
package Lesson9;


public class Student {
    
    public String fullName;
    public int z = 10;
    public static int c = 5;
    
    public Student(String fullName) {
    
        this.fullName = fullName;
        
    }
    
}

class StudentTest {

    public static void main(String[] args) {
        
        Student st1 = new Student("nik");
        Student st2 = new Student("mik");
        Student st3 = new Student("pik");
        // создали 2 объекта
        
        Student st4;
        // адрес пустой, никуда не ссылается
        // ПУСТАЯ ССЫЛКА
        
        // КАК ПОТЕРЯТЬ СВЯЗЬ С ОБЪЕКТОМ?
        
        // первый вариант
        st1 = null;
        // теперь переменная st1 не ссылается на объект класса Student
        // теперь это просто переменная с пустым адресом
        
        // второй вариант
        
        st2 = new Student("cik");
        // теперь st2 содержит ссылку на новый объект класса Student
        // предыдущий адрес (B231) переписался на (M555)
        
    }
    
    // третий вариант
    
//    System.out.println(st3.fullName);
// out of scope - объект st3 создан внутри метода main, мы можем видеть и обращаться к нему
// ТОЛЬКО ВНУТРИ МЕТОДА MAIN

}

// ЧЕТВЕРТЫЙ вариант
// Garbage collector - делает сама jvm
// при указании st1 = null; мы даем понять Garbage collector, что нам нужно это убрать