
package Lesson10;

import Lesson10.Subpackage.Employee;
// импорт класса Employee подпакета Lesson10.Subpackage
import static Lesson10.Subpackage.Employee.numberForStaticImport;
// для импорта любого статичного элемента

public class C {
    
    public static void main(String[] args) {
        
        
        Employee emp1 = new Employee(21, "mike");
        System.out.println(emp1.age);
        System.out.println(emp1.name);
        
        int trickNumber = numberForStaticImport;
        // благодаря импорту статично переменной, нам не надо прямо указывать класс
        // Lesson10.Subpackage.Employee.numberForStaticImport
        
        System.out.println(trickNumber); // 10
        
    }
    
}
