
package Lesson18;

public class Test10 {
    
    public static void main(String[] args) {
        
        // из массива чар {'p', 'r', 'i', 'v', 'e', 't'}
        // получаем строку privet
        // прокинув массив чар в параметр конструктора Стринг
        char [] arr1 = {'p', 'r', 'i', 'v', 'e', 't'};
        String s1 = new String(arr1);
        System.out.println(s1); // privet
        
        
        char [] arr2 = {'p', 'r', 'i', 'v', 'e', 't'};
        StringBuilder sb2 = new StringBuilder("Hello world");
        sb2.append(arr2, 2, 4);
        System.out.println(sb2); // Hello worldivet
        // как мы это получили
        // сб была Hello world
        // + срез arr2 с 2 по 4 индексы - это ('i', 'v', 'e')
        // таким образом Hello world+('i', 'v', 'e') = Hello worldivet
        
        
        
    }
    
}
