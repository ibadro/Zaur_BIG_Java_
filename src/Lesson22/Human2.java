
package Lesson22;

public class Human2 {
    
//    public Human2(String name) {
//        this.name = name;
//    }
    
    private String name = "Kolya"; // прайват элементы не наследуются
    // НО ВЕДЬ МЫ МОЖЕМ ЗАИНКАПСУЛИРОВАТЬ И РАБОАТЬ С НЕЙ
    
    public String getName(){
        System.out.println(name);
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public static int salary = 1200;
    
    public void work(){
        System.out.println("working");
    }
    
    public static void rest() {
        System.out.println("have a rest");
    }
    
}

class Student extends Human2{
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        System.out.println(Student.salary); // более правильное написание для статической переменной
        s1.work(); // working
        Student.rest(); // have a rest
        
    }
    
}