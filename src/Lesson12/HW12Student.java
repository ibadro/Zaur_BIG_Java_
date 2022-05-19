
package Lesson12;

public class HW12Student {
    
    String name;
    int course;
    double grade;
    
    HW12Student(String name, int course, double grade) {
    
    this.name = name;
    this.course = course;
    this.grade = grade;
    
    }
    
}

class HW12StudentTest {

    void areStudentsEqual(HW12Student student1, HW12Student student2) {
    
        if((student1.name.equals(student2.name)) && (student1.course == student2.course) && (student1.grade == student2.grade)) {
            System.out.println("students are equal");
        } else {
            System.out.println("students are not equal");
        }
        
    }
    
    void compareAllParams(HW12Student student1, HW12Student student2) {
    
        if(student1.name.equals(student2.name)) {
            
            if(student1.course == student2.course) {
                
                if(student1.grade == student2.grade) {
                    
                    System.out.println("Congrats!!! Students are equal");
                    
                } else {
                    System.out.println("Everything is fine, buuuut grades are not equal");
                }
                
            } else {
                System.out.println("Names - ok, but courses are not equal");
            }
                
        } else {
            System.out.println("Names are not equal");
        }
    
    }
    
    public static void main(String[] args) {
        
        HW12StudentTest executeObject = new HW12StudentTest();
        
        HW12Student st1 = new HW12Student("Brad", 5, 8.8);
        HW12Student st2 = new HW12Student("Brad", 4, 8.8);
        HW12Student st3 = new HW12Student("Brad", 5, 8.8);
        
        System.out.println("verification of first method");
        executeObject.areStudentsEqual(st1, st2); // students are not equal
        executeObject.areStudentsEqual(st1, st3); // students are equal
        
        System.out.println("verification of second method");
        
        HW12Student st4 = new HW12Student("Brad", 5, 8.8);
        HW12Student st5 = new HW12Student("Vadim", 5, 8.8);
        HW12Student st6 = new HW12Student("Brad", 6, 6.8);
        HW12Student st7 = new HW12Student("Brad", 5, 8.0);
        HW12Student st8 = new HW12Student("Brad", 5, 8.8);
        
        executeObject.compareAllParams(st4, st5); // Names are not equal
        executeObject.compareAllParams(st4, st6); // Names - ok, but courses are not equal
        executeObject.compareAllParams(st4, st7); // Everything is fine, buuuut grades are not equal
        executeObject.compareAllParams(st4, st8); // Congrats!!! Students are equal
        
        
        
    }

}
