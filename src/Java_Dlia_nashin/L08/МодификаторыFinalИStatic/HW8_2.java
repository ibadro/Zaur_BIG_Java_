
package Java_Dlia_nashin.L08.МодификаторыFinalИStatic;
/*в первом классе создайте статик финал переменную Пи=3,14.
* Используйте данную константу в нонстатик методе, который принимает в параметр значение радиуса и вычисляет площадь круга по формуле.
* Также используйте данную константу в статик методе, который принимает в параметр значение радиуса и вычисляет длину окружности по формуле.
* Создайте еще один нон статик метод, который принимает в параметре значение  радиуса и выводит на экран информацию радиусе, площади круга и длине окружности. Используйте все три метода вл 2 классе. */
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
        HW8_2.getLength(108);
        
        System.out.println("");
        executeObject.showInfo(8);
        
    }
    
}