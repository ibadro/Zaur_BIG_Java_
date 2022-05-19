package Lesson29;

import java.util.*;

public class Lambdas2 {

    public static void main(String[] args) {

        List<String> list = List.of("privet", "poka", "kak dela", "norm");

//        for(String s:list){
//            System.out.println(s);
//        }
        // forEach
        list.forEach(s -> System.out.println(s)); // тоже самое, что и форич луп, только при помощи лямбды

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(2);
        aList.add(6);
        aList.add(4);
        aList.add(5);
        aList.add(3);
        aList.add(7);
        aList.add(1);


        // sort
        System.out.println(aList); // [2, 6, 4, 5, 3, 7, 1]
        aList.sort((x, y) -> x.compareTo(y)); // сравниваем 2 значения и возвращает, 1 , когда первый больше второго, 0 - когда равны и -1 , когда второй больше первого
        System.out.println(aList); // [1, 2, 3, 4, 5, 6, 7]
        aList.sort((x, y) -> -x.compareTo(y)); // в обратном порядке сортировка
        System.out.println(aList); // [7, 6, 5, 4, 3, 2, 1]
        
//      removeIf - ИСПОЛЬЗУЕТ ПРЕДИКЕТ С МЕТОДОМ ТЕСТ, КОТОРЫЙ ДОЛЖЕН ВЕРНУТЬ БУЛЕАН ЗНАЧЕНИЕ
        aList.removeIf(element -> element % 3 == 0);
        System.out.println(aList); // [7, 5, 4, 2, 1] // 3 и 6 - удалились

    }

}
