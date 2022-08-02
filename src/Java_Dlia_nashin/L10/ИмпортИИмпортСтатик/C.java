
package Java_Dlia_nashin.L10.ИмпортИИмпортСтатик;

import Java_Dlia_nashin.L10.ИмпортИИмпортСтатик.Subpackage.Employee;
// импорт класса Employee подпакета Java_shernii_poias.Lesson1.Lesson10.Subpackage

// для импорта любого статичного элемента

public class C {
    
    public static void main(String[] args) {
        
        
        Employee emp1 = new Employee(21, "mike");
        System.out.println(emp1.age);
        System.out.println(emp1.name);
        
        int trickNumber = Employee.numberForStaticImport;
        // благодаря импорту статично переменной, нам не надо прямо указывать класс
        // Java_shernii_poias.Lesson1.Lesson10.Subpackage.Employee.numberForStaticImport
        
        System.out.println(trickNumber); // 10
        
    }
    
}
