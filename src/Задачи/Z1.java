package Задачи;
/*Напишите класс, который принимает с клавиатуры целое число и выводит на экран следующие три значения (все - в одной строке, разделенные пробелом): число, меньше введенного с клавиатуры на 1,
число, введенное с клавиатуры, и число, больше введенного с клавиатуры на 1.*/


import java.util.Scanner;

public class Z1 {
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int a, b, c;
        a = in.nextInt();
        b = a - 1;
        c = a + 1;
        System.out.println(b + " " + a + " " + c);

    }
}