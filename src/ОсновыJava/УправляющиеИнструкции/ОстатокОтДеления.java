package ОсновыJava.УправляющиеИнструкции;
// Демонстрация использования оператора %
public class ОстатокОтДеления {
    public static void main(String args[]) {
        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;
        System.out.println("Результат и остаток от деления 10/3: " +   iresult + " " + irem);
        System.out.println("Результат и остаток от деления  10.0 / 3.0: " + dresult + " "+ drem);
}
}
//Как видите, оператор % дает остаток от деления как целых чисел,так и чисел с плавающей точкой.