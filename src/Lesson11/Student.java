
package Lesson11;

public class Student {
    
    String name;
    int course;
    double grade;
    
    Student(String name, int course, double grade) {
    
    this.name = name;
    this.course = course;
    this.grade = grade;
    
    }
    
    public static void swap(Student s1, Student s2) { // статик потому что, мне не нужно создавать новых студентов
        // мы работаем с уже созданными, и этим методом мы поменяем ссылку студента 1 на ссылку студента 2 и наоборот
    
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        
        System.out.println(s1.name); // petr
        // s1.name = st1.name // а st1 поменялся ссылками с st2/ то есть они поменялись ссылками друг с другом
        System.out.println(s2.name); // Ivan
        // s2.name = st2.name // а st2 поменялся ссылками с st1/ то есть они поменялись ссылками друг с другом
    }
    
    public void changeName(Student s1) {
    
        s1.name = "Vasiliy";
    
    }
    
    public static void main(String[] args) {
        
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 4, 5.6);
        
        swap(st1, st2);
        
        System.out.println(st1.name); // ivan
        System.out.println(st2.name); // petr
        // swap(st1, st2) не сработал, так как изменения ссылок с одного объекта на другой просходит локально
        // глобально st1.name как был ivan, так и остался, st2.name как был petr, так и остался
        
        
        System.out.println("******");
        st2.changeName(st2);
        System.out.println(st2.name); // имя поменялось с петра на Vasiliy
        // ПОЧЕМУ???
        // ПОТОМУ ЧТО ПРИ ПОМОЩИ КОПИИ МЫ ПОМЕНЯЛИ ЗНАЧЕНИЕ ОБЪЕКТА С ПЕТРА НА ВАСИЛИЙ, КОПИЯ В МЕТОДЕ ИСЧЕСЛА, А ВОТ ОБЪЕКТ ИЗМЕНИЛСЯ ВСЁ РАВНО
        // ТО ЕСТЬ МЫ ПОЛУЧАЕМ ОБНОВЛЕННОЕ ЗНАЧЕНИЕ
        
    }
    // когда в параметр метода подставляется референс тип данных, в параметр на самом деле вставляется копии этих референсов
    // С ПОМОЩЬЮ КОПИЙ МЫ МОЖЕМ МЕНЯТЬ ПАРАМЕТРЫ ОБЪЕКТОВ, НО МЫ НЕ МОЖЕМ МЕНЯТЬ РЕФЕРЕНСЫ(ССЫЛКИ) НА САМ ОБЪЕКТ, ИБО КОПИИ ИХ УМИРАЮТ В МЕТОДАХ
    
}
