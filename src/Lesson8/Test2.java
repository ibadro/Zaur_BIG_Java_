
package Lesson8;


public class Test2 {
    
     public final int b; // ошибка компилятора, ибо константа должна быть определена
     // мы можем обойти ее, создав конструктор и присвоив константе а значение внутри конструктора
     
     
    Test2() {

        b = 10;
    
    }
    
     
    Test2(boolean c) {

        b = 15;
    
    }
     
    // что мы видим, мы можем установить 2 значения константы b в 2 разных конструкторах
     
    
    public void abc(final short s) { // делаем константный параметр
    
        final byte bb;
        bb = 10;
        // делаем локальную переменную константой
        // в отличие от инстанс переменных мы можем сразу создать, а потом присвоить ей значение
        System.out.println(s + bb);
        
    }
     
     
}


class Test2Test {

    public static void main(String[] args) {
        
        Test2 t1 = new Test2();
        System.out.println(t1.b); // 10
        
        Test2 t2 = new Test2(true);
        System.out.println(t2.b); // 15
        
        // при помощи 2 конструкторов получили 2 разных значения константы b
               
        
    }

}