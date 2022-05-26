package ОсновыJava.КлассСтринг;
// Знакомство с классом String
public class StringDemo {
    public static void main(String args[]) {
// Различные способы объявления строк
        String str1 = "Java - лидер Интернета!";
        String str2 = new String(str1);
        String str3 ="Строки Java эффективны.";
        int result, idx;
        char ch;
        System.out.println("Длина strl: " + str1.length());
// Отображение строки strl посимвольно
        for(int i=0; i < str1.length(); i++)
            System.out.print(str1.charAt(i) ) ;
        System.out.println();
        if(str1.equals(str2))
            System.out.println("strl эквивалентна str2");
        else
            System.out.println("strl не эквивалентна str2");
        if(str1.equals(str3))
            System.out.println("strl эквивалентна str3");
        else
            System.out.println("strl не эквивалентна str3");
        result = str1.compareTo(str3);
        if(result == 0)
            System.out.println("strl и str3 равны");
        else if (result < 0)
            System.out.println("strl меньше str3");
        else
            System.out.println("strl больше str3");
// Присваивание переменной str2 новой строки
        str2 = "One Two Three One";
        idx = str2.indexOf("One") ;
        System.out.println("Индекс первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения One: " + idx);
    }
    }
