
package Lesson20;

import java.util.ArrayList;
import java.util.List;



public class Test1 {
    
    public static void main(String[] args) {
        
        ArrayList list1 = new ArrayList();
        list1.add("hi");
        // добавление строки хай в аррейЛист лист1
        
        Car c = new Car();
        list1.add(c);
        Student s1 = new Student();
        list1.add(s1);
        
        StringBuilder sb1 = new StringBuilder("sss");
        list1.add(sb1);
        // в ArrayList можно добавить одновременно кучу разных типов данных
        
        
        ArrayList <String> list2 = new ArrayList <String>();
        ArrayList <String> list3 = new ArrayList(); // так тоже можно писать
        // таким образом создается ArrayList, который будет содержать и будет относится
        // к ОПРЕДЕЛЕННОМУ ТИПУ ДАННЫХ
        // ЭТОТ ТИП ДАННЫХ УКАЗЫВАЕТСЯ В <>
        list2.add("poka"); // в ArrayList <String> list2 можно добавлять ТОЛЬКО String
//        list2.add(c); // нельзя, тк в ArrayList <String> list2 можно добавить только String

        
        
        
    }
    
}


class Car{

}

class Student{

}

