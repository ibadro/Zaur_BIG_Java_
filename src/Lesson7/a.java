
package Lesson7;

public class a {
    
    public static void main(String[] args) {
        
        b objectB = new b();
        // из класса а мы создаем объект класса b, тк они находятся внутри одного пакета Lesson7
        
//        Employee emp = new Employee();
//        не могу обратиться из класса а к классу Employee, тк
//        они находятся в разных пакетах (Employee - Lesson6)
//        чтобы обратиться к классу из другого пакета, нужно указывать полный путь

        
        Lesson6.HW6Student studentAbramov = new Lesson6.HW6Student();
        // чтобы обращаться к классу из другого пакета, нужно сделать его public
        // и обращаться полным путем Имяпакета.Имякласса объект = new Lesson6.HW6Student();
        
        studentAbramov.averagePoint(4, 5, 3);
        // чтобы обратиться к методу averagePoint из класса Лессон 6, я сделал его паблик в пакете Лессон6
        
        
    }   
    
    
}
