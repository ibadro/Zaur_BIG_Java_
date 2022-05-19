
package Lesson8;


public class Student {
    
    String name;
    int course;
    static int count; // для нее выделяется место в памяти не связанное с объектами, А СВЯЗАННОЕ С САМИМ КЛАССОМ!
    // что мы сделали, сделав инт каунт статик, мы сделали ее из переменной
    // объект, переменной ВСЕГО КЛАССА
    // БЕЗ static, МЫ БЫ ИМЕЛИ 
    //Student 1 is created!
    //Student 1 is created!
    //Student 1 is created!
    
    public Student(String name1, int course1) {
        
        count++;
        name = name1;
        course = course1;
        System.out.println("Student " + count + " is created!");
    
    }
    
}

class StudentTest {

    public static void main(String[] args) {
        
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Igor", 3);
        Student st3 = new Student("Dima", 2);
        
        System.out.println("******");
        System.out.println(Student.count); 
        // ссылаемся не так st1.count, а Student.count
        // потому что каунт принадлежит не какому-то отдельному объекту,
        // А ВСЕМУ КЛАССУ!!!
        
        
        
    }

}
