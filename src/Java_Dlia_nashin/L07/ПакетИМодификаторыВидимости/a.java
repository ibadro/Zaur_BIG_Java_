
package Java_Dlia_nashin.L07.ПакетИМодификаторыВидимости;

import Java_Dlia_nashin.L06.ПерезагрузкаМетодовИКонструкторов.HW6Student;

public class a {
    
    public static void main(String[] args) {
        
        b objectB = new b();
        // из класса а мы создаем объект класса b, тк они находятся внутри одного пакета Java_shernii_poias.Lesson1.Lesson7
        
//        Employee emp = new Employee();
//        не могу обратиться из класса а к классу Employee, тк
//        они находятся в разных пакетах (Employee - Java_shernii_poias.Lesson1.Lesson6)
//        чтобы обратиться к классу из другого пакета, нужно указывать полный путь

        
        HW6Student studentAbramov = new HW6Student();
        // чтобы обращаться к классу из другого пакета, нужно сделать его public
        // и обращаться полным путем Имяпакета.Имякласса объект = new Java_shernii_poias.Lesson1.Lesson6.HW6Student();
        
        studentAbramov.averagePoint(4, 5, 3);
        // чтобы обратиться к методу averagePoint из класса Лессон 6, я сделал его паблик в пакете Лессон6
        
        
    }   
    
    
}
