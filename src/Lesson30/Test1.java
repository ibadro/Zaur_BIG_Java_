package Lesson30;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet"); // вместо <T> - указывавем нужный нам тип данных String
        System.out.println(info1); // {[privet]}

        Info<Integer> info2 = new Info<>(22); // вместо <T> - указывавем нужный нам тип данных Integer
        System.out.println(info2); // {[22]}
    }

    // 2 метода ниже вызывают ошибку оверлодинга, для компилятора они выглядят одинаково
    // это особенность использования дженерикс
    //  для компилятора они выглядят так: public void abc(Info info) и public void abc(Info info)
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}
// GENERICS

class Info<T> { // вместо T можно увидеть другие символы, так же может выглядеть 
    // class Info<T, Y> - может иметь несколько тайпплейсхолдеров

    private T value; // имя переменной value типа данных T

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }

}


// С ОВЕРРАЙДИНГОВ ТАКАЯ ЖЕ СИТУАЦИЯ, БУДЬ ОСТОРОЖНЕЕ С ОВЕРЛОАДИНГОМ И ОВЕРРАЙДИНГОМ С ДЖЕНЕРИКС

//class Parent{
//
//    public void abc(Info <String> info){
//        String s = info.getValue();
//    }
//    
//}
//
//class Child extends Parent{
//
//    public void abc(Info <Integer> info){
//        String s = info.getValue();
//    }
//    
//}