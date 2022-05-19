
package Lesson6;

class Overloading2 {
    
    int sum(int i1, int i2) {
    
        return i1 + i2;
        
    }
    
    
    String sum (String s1, String s2) {
    
        return s1 + s2;
    
    }
    
    // эти методы оверлодед, их реторн тайп разный, поэтому компилятор их пропускает 
    // при вызове метода неважно какой стоит аксес модефаер или реторн тайп
//    protected void sum(int a, int b) {
//    
//        System.out.print("ggg");
//    
//    }
    // этот код не пропустит компилятор, тк не важно какой стоит аксес модефаер или реторн тайп
    // важны лишь типы данных в параметрах и их количество, это не должно совпадать!!!!
    
    
}

class Overloading2Test {

    public static void main (String [] args) {
    
        Overloading2 over2 = new Overloading2();
        
        int a = over2.sum(5, 7);
        System.out.println(a);
        
        String summ = over2.sum("Hi, ", "Bob");
        System.out.println(summ);
        
        
    }

}//  ИТОГ: ОВЕРЛОДЕД МЕТОДЫ ИМЕЮТ ОДИНАКОВЫЕ ИМЕНА И РАЗНЫЙ СПИСОК ПАРАМЕТРОВ!!!!!