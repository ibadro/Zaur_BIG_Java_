
package Lesson4;

public class HW4Student {
    
    int ticketNumber;
    String firstName;
    String lastName;
    int year;
    double mathPoint;
    double economicsPoint;
    double foreignLanguagePoint;
    double averagePoint;
    
}

class HW4StudentTest {

    public static void main(String [] args) {
    
        HW4Student studentA = new HW4Student();
        HW4Student studentB = new HW4Student();
        HW4Student studentC = new HW4Student();       
        
        studentA.ticketNumber = 75534;
        studentB.ticketNumber = 75894;
        studentC.ticketNumber = 76434;
        
        studentA.firstName = "Oleg";
        studentA.lastName = "Glebovitch";
        studentB.firstName = "Petr";
        studentB.lastName = "Karlovitch";
        studentC.firstName = "Vasilij";
        studentC.lastName = "Markovitch";
        
        studentA.year = 2020;
        studentB.year = 2021;
        studentC.year = 2021;
        
        studentA.mathPoint = 7.8;
        studentA.economicsPoint = 8;
        studentA.foreignLanguagePoint = 5.6;
        studentB.mathPoint = 5.8;
        studentB.economicsPoint = 6;
        studentB.foreignLanguagePoint = 8.6;
        studentC.mathPoint = 10;
        studentC.economicsPoint = 10;
        studentC.foreignLanguagePoint = 9;
        
        
        studentA.averagePoint = (studentA.mathPoint + studentA.economicsPoint + studentA.foreignLanguagePoint) / 3;
        studentB.averagePoint = (studentB.mathPoint + studentB.economicsPoint + studentB.foreignLanguagePoint) / 3;
        studentC.averagePoint = (studentC.mathPoint + studentC.economicsPoint + studentC.foreignLanguagePoint) / 3;
        
        
        
        System.out.println("first name: " + studentA.firstName + ", last name: " + studentA.lastName + ", year: " + studentA.year + ", average point: " + studentA.averagePoint);
        System.out.println("first name: " + studentB.firstName + ", last name: " + studentB.lastName + ", year: " + studentB.year + ", average point: " + studentB.averagePoint);
        System.out.println("first name: " + studentC.firstName + ", last name: " + studentC.lastName + ", year: " + studentC.year + ", average point: " + studentC.averagePoint);

      
    }

}
