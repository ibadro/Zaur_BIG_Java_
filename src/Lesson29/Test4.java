
package Lesson29;

public class Test4 {
    
    static void def(Test4_2 t){
        System.out.println(t.abc("Привет"));
    }
    
    public static void main(String[] args) {
        
        // так сделано вместо того, чтобы создавать класс, который оверрайдит 
        // абстрактный метод интерфейса, мы используем лямбда выражение,
        // которое уверрайдит его прямо в параметре
        def((String s) -> {return s.length();}); // 6
        
    }
    
}

interface Test4_2{
    int abc(String s);
}

