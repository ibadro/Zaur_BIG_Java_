
package Lesson12;

public class Lesson12_2 {
    
    public static void main(String[] args) {
        
        int salary = 200;
        boolean b1 = true;
        
        if (salary < 200 && b1 == false) {
            System.out.println("salary is very low");
        } else if (salary < 400) {
            System.out.println("salary is normal");
        } else if (salary < 600) {
            System.out.println("salary is high");
        } else {
            System.out.println("salary is perfect");
        }
        // salary is normal - тк salary < 200 пропускается, потому что b1 == false
    }
    
}
