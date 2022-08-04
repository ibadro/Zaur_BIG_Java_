
package Java_Dlia_nashin.L17.StringBuilder;
// Создайте класс, в котром создайте метод ravenstvo. Инпут паратметрами данного метода будут 2 обькта класса StringBuilder
// Модод должен иметь boolean tupe, возвращать true, если значения обьетов сопадают, false - если не совпадают.
// Продемонстрируйте данный метод.
public class HW17StringBuilder {
    
    boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        
        boolean result = true;
        
        if (sb1.length() == sb2.length()) { // если длина обоих strinbuilderов одинакова то начинаем проверку
            
            for (int i = 0; i < sb1.length(); i++) { // цикл проверяем чар на каждой позиции начиная с 0 для обектов сб1 и сб2
            
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    
                    result = false;
                    break;
                }
            }
        } else { // если длина не совпадает -заканчиваем
            result = false;
        }
        return result;
    }
}

class StringBuilderTest {
    
    public static void main(String[] args) {
        
        HW17StringBuilder executionObj = new HW17StringBuilder();
    
        StringBuilder sb1 = new StringBuilder("Hi");
        StringBuilder sb2 = new StringBuilder("Hi");
        
        boolean example1 = executionObj.ravenstvo(sb1, sb2);
        System.out.println(example1); // true
        
        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuilder sb4 = new StringBuilder("Helll0");
        
        boolean example2 = executionObj.ravenstvo(sb3, sb4);
        System.out.println(example2); // false
        
        
    }
    
}
