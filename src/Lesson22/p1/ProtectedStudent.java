
package Lesson22.p1;

import Lesson22.ProtectedHuman; 

class ProtectedStudent extends ProtectedHuman {
    
    public static void main(String[] args) {
        
        ProtectedStudent s1 = new ProtectedStudent();
        System.out.println(s1.age);
        System.out.println(s1.salary);
        // протектед параметры видны в чайлд классе ProtectedStudent родителя ProtectedHuman
    }
    
}

class Test {
    
    public static void main(String[] args) {
        
        ProtectedStudent s2 = new ProtectedStudent();
//        System.out.println(s2.age);
//        System.out.println(s2.salary);
        
        // мы не можем обращаться к протектед элементам класса ProtectedHuman
        // потому что  к протектед элементам могут обращаться только классы, находящиеся
        // в одном пакете или дети родительского элемента
        
    }
    
}

class ProtectedTest extends ProtectedHuman {

    public static void main(String[] args) {
        
        ProtectedTest t3 = new ProtectedTest();
        System.out.println(t3.age);
        System.out.println(t3.salary);
        // а теперь могу, потому что класс ProtectedTest - ребенок ProtectedHuman
        
        ProtectedHuman h1 = new ProtectedHuman();
//        System.out.println(h1.age);
//        System.out.println(h1.salary);
        
        // ОБЪЕКТ КЛАССА ProtectedHuman, В КОТОРОМ И ЛЕЖАТ ЭТИ ПРОТЕКТЕД ЭЛЕМЕНТЫ
        // СЕЙЧАС НАХОДИТСЯ В ДРУГОМ ПАКЕТЕ, СЛЕДОВАТЕЛЬНО НЕ ВИДИТ ИХ
        // ТОЛЬКО ДЕТИ КЛАССА ProtectedHuman   СМОГУ ЕГО УВИДЕТЬ, ИЛИ ЕСЛИ МЫ ПЕРЕМЕСТИМ ЭТОТ ОБЪЕКТ
        // В ПАКЕТ, В КОТОРОМ ЛЕЖИТ САМ КЛАСС ProtectedHuman

        
    }
    
    
}
