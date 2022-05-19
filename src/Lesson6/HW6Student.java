
package Lesson6;

public class HW6Student {
      
    int ticketNumber;
    String firstName;
    String lastName;
    int course;
    
    HW6Student(String fName, String lName, int c, int tNumber) {
    
        firstName = fName;
        lastName = lName;
        course = c;       
        ticketNumber = tNumber;
     
    }  
    
    HW6Student(String lName2, int c2) {
    
        this(null, lName2, c2, 0);
    
    }
    
    public HW6Student() {
    // empty
    }
    
    public double averagePoint (double m, double e, double f) {
    
        double result;
        result = (m + e + f) / 3;
        System.out.println("firstName: " + firstName + ", last name: " + lastName + ", average point: " + result);
        return result;
    
    }  

}

class HW6StudentTest {

    public static void main(String [] args) {
    
        HW6Student studentA = new HW6Student();
        HW6Student studentB = new HW6Student("Bondar", 5);
        HW6Student studentC = new HW6Student("Petr", "Petrov", 5, 17444);
        
        studentA.averagePoint(7, 8, 8);
        studentB.averagePoint(8, 8, 9);
        studentC.averagePoint(9, 9, 8);
        
    
    }

}
