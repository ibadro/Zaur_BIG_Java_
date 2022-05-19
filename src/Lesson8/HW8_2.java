
package Lesson8;

public class HW8_2 {
    
    public static final double pi = 3.14;
    
    public double getCircle(double rad) {
    
        double result;
        result = pi * rad * rad;
        System.out.println(result);
        
        return result;
        
    }
    
    public static double getLength(double rad) {
    
        double result;
        result = 2 * pi * rad;
        System.out.println(result);
        
        return result;
    
    }
    
    public void showInfo(double rad) {
    
        System.out.println("Радиус равен: " + rad);
        HW8_2 circle1 = new HW8_2();
        
        getCircle(rad);
        getLength(rad);
        
    }
   
}
 
class HW8_2Test {

    public static void main(String[] args) {
        
        HW8_2 executeObject = new HW8_2();
        
        executeObject.getCircle(8);
        HW8_2.getLength(8);
        
        System.out.println("");
        executeObject.showInfo(8);
        
    }
    
}