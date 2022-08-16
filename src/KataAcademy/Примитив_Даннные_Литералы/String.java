package KataAcademy.Примитив_Даннные_Литералы;
import java.util.*;
public class String {
    public static void main(String[] args) {



    String str1sdf11= "sdfasdf ";
    java.lang.String s1 = new String("Hi");
    String str2 = new String(); // пустая строка
    String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
    String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов

    System.out.println(str111); // Java
    System.out.println(str2); //
    System.out.println(str3); // hello
    System.out.println(str4); // come

    }
}
/*concat(): объединяет строки

valueOf(): преобразует объект в строковый вид

join(): соединяет строки с учетом разделителя

сompareTo(): сравнивает две строки

charAt(): возвращает символ строки по индексу

getChars(): возвращает группу символов

equals(): сравнивает строки с учетом регистра

equalsIgnoreCase(): сравнивает строки без учета регистра

regionMatches(): сравнивает подстроки в строках

indexOf(): находит индекс первого вхождения подстроки в строку

lastIndexOf(): находит индекс последнего вхождения подстроки в строку

startsWith(): определяет, начинается ли строка с подстроки

endsWith(): определяет, заканчивается ли строка на определенную подстроку

replace(): заменяет в строке одну подстроку на другую

trim(): удаляет начальные и конечные пробелы

substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса

toLowerCase(): переводит все символы строки в нижний регистр

toUpperCase(): переводит все символы строки в верхний регистр*/