package Lesson30;

import java.util.ArrayList;

public class Test2 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(150);
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("b");
        
        int a = GenericsMethod.getSecondElement(list);
        System.out.println(a); // 30
        
        String s = GenericsMethod.getSecondElement(list2);
        System.out.println(s); // b
        
    }
    
}

class GenericsMethod {

    public static <T> T getSecondElement(ArrayList<T> a1) { // <T> T - реторн тайп, означает, что мы используем дженерикс
        return a1.get(1); // 1 потому что мы ищем второй элемент аррейлиста
    }

}
