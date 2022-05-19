
package Lesson29;

import java.util.ArrayList;

public class Test1 {
    
}

class Student{

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;   
    
    Student(String name, char sex, int age, int course, double avgGrade){
    
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    
    }

}

class StrudentInfo{

    void printStudent(Student st){
        System.out.println("Name: " + st.name + ", sex: " + st.sex + ", age: " + st.age + ", course: " + st.course + ", average grade: " + st.avgGrade);
    }
    void printStudentsOverGrade(ArrayList <Student> aL, double avgGrade){
        for(Student s:aL){
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }   
        }   
    }
    void printStudentsUnderGrade(ArrayList <Student> aL, double avgGrade){
        for(Student s:aL){
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }   
        }   
    }
    void printStudentsOverAge(ArrayList <Student> aL, int age){
        for(Student s:aL){
            if (s.age > age) {
                printStudent(s);
            }   
        }   
    }
    void printStudentsUnderAge(ArrayList <Student> aL, int age){
        for(Student s:aL){
            if (s.age < age) {
                printStudent(s);
            }   
        }   
    }
    void printStudentsBySex(ArrayList <Student> aL, char sex){
        for(Student s:aL){
            if (s.sex == sex) {
                printStudent(s);
            }   
        }   
    }
    void printStudentsMixConditions(ArrayList <Student> aL, double avgGrade, int age, char sex){
        for(Student s:aL){
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }  
        }   
    }
    
    public static void main(String[] args) {
        
        ArrayList <Student> list = new ArrayList <>();
        
        Student st1 = new Student("Ivan", 'm', 22 , 3, 8.3);
        Student st2 = new Student("Nikolai", 'm', 28 , 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19 , 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35 , 4, 7);
        Student st5 = new Student("Maria", 'f', 23 , 3, 9.1);
        
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        
        StrudentInfo execute = new StrudentInfo();
        
        execute.printStudentsOverGrade(list, 8.5);
//        Name: Elena, sex: f, age: 19, course: 1, average grade: 8.9
//        Name: Maria, sex: f, age: 23, course: 3, average grade: 9.1

        System.out.println("*************");
        
        execute.printStudentsUnderGrade(list, 9);
//        Name: Ivan, sex: m, age: 22, course: 3, average grade: 8.3
//        Name: Nikolai, sex: m, age: 28, course: 2, average grade: 6.4
//        Name: Elena, sex: f, age: 19, course: 1, average grade: 8.9
//        Name: Petr, sex: m, age: 35, course: 4, average grade: 7.0

        System.out.println("*************");
        
        execute.printStudentsOverAge(list, 25);
//        Name: Nikolai, sex: m, age: 28, course: 2, average grade: 6.4
//        Name: Petr, sex: m, age: 35, course: 4, average grade: 7.0

        System.out.println("*************");
        
        execute.printStudentsUnderAge(list, 27);
//        Name: Ivan, sex: m, age: 22, course: 3, average grade: 8.3
//        Name: Elena, sex: f, age: 19, course: 1, average grade: 8.9
//        Name: Maria, sex: f, age: 23, course: 3, average grade: 9.1

        System.out.println("*************");
        
        execute.printStudentsBySex(list, 'm');
//        Name: Ivan, sex: m, age: 22, course: 3, average grade: 8.3
//        Name: Nikolai, sex: m, age: 28, course: 2, average grade: 6.4
//        Name: Petr, sex: m, age: 35, course: 4, average grade: 7.0
        System.out.println("*************");
        
        execute.printStudentsMixConditions(list, 7.2, 23, 'f');
//        Name: Elena, sex: f, age: 19, course: 1, average grade: 8.9
        
        
    }

}