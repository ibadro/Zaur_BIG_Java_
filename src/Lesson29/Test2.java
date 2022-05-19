
package Lesson29;

import java.util.ArrayList;

public class Test2 {
    
    public static void main(String[] args) {
        
        ArrayList <Student2> list = new ArrayList <>();
        Student2 st1 = new Student2("Ivan", 'm', 22 , 3, 8.3);
        Student2 st2 = new Student2("Nikolai", 'm', 28 , 2, 6.4);
        Student2 st3 = new Student2("Elena", 'f', 19 , 1, 8.9);
        Student2 st4 = new Student2("Petr", 'm', 35 , 4, 7);
        Student2 st5 = new Student2("Maria", 'f', 23 , 3, 9.1);       
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        
        StrudentInfo2 si = new StrudentInfo2();
        
        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        FindStudentsOverAge fsoa = new FindStudentsOverAge();
        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
        FindStudentsBySex fsbs = new FindStudentsBySex();
        FindMixConditions fmc = new FindMixConditions();
        
        si.testStudents(list, fsog);
        System.out.println("****");
        si.testStudents(list, fsug);
        System.out.println("****");
        si.testStudents(list, fsoa);
        System.out.println("****");
        si.testStudents(list, fsua);
        System.out.println("****");
        si.testStudents(list, fsbs);
        System.out.println("****");
        si.testStudents(list, fmc);
        System.out.println("****");
        
        
    }
    
}

class Student2{

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;   
    
    Student2(String name, char sex, int age, int course, double avgGrade){
    
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    
    }

}

class StrudentInfo2{
    void printStudent(Student2 st){
        System.out.println("Name: " + st.name + ", sex: " + st.sex + ", age: " + st.age + ", course: " + st.course + ", average grade: " + st.avgGrade);
    }
    void testStudents(ArrayList <Student2> aL, StudentChecks sc){
        
        for(Student2 s:aL){
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    
    }
}

interface StudentChecks{
    boolean test(Student2 s);
}

class FindStudentsOverGrade implements StudentChecks{
@Override
    public boolean test(Student2 s){
        return s.avgGrade > 8.5;
    }
    
}
class FindStudentsUnderGrade implements StudentChecks{
@Override
    public boolean test(Student2 s){
        return s.avgGrade < 9;
    }
    
}
class FindStudentsOverAge implements StudentChecks{
@Override
    public boolean test(Student2 s){
        return s.age > 25;
    }
    
}
class FindStudentsUnderAge implements StudentChecks{
@Override
    public boolean test(Student2 s){
        return s.age < 27;
    }
    
}
class FindStudentsBySex implements StudentChecks{
@Override
    public boolean test(Student2 s){
        return s.sex == 'm';
    }
    
}
class FindMixConditions implements StudentChecks{
@Override
    public boolean test(Student2 s){
        return (s.sex == 'f' && s.avgGrade > 7.2 && s.age < 23);
    }
    
}