
package Java_Dlia_nashin.L08.МодификаторыFinalИStatic;
/*В первом классе создайте 2 статик метода. 1-ый пусть умножает 3 числа из параметра метода и возвращает их произведению 2 -ой - делит первое число из параметра на второе и ничего не возвращает
, лишь выводит на дисплей в читабельном виде целое частное и остаток. Во втором классе по два раза используйте данные методы.*/
public class   HW8 {
    
    static int mult(int a, int b, int c) {
    
        int result;
        result = a * b * c;
        
        System.out.println(result);
        return result;        
        
    } 
    
    static void div(int a, int b) {
    
        int wholeN = a / b;
        int restN= a % b; 
        
        System.out.println("Целое: " + wholeN + ", остаток: " + restN);
        
    }
    
}


class HW8Test {

    public static void main(String[] args) {

        
        HW8.mult(1, 3, 4);
        HW8.div(55, 6);
        
        HW8.mult(11, 32, 42);
        HW8.div(553, 6);
        
        // вызываем без создания объектов, тк методы статичны
        
    }
    
}