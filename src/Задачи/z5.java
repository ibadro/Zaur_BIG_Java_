package Задачи;

import java.util.Scanner;

// Напишите класс, который принимает с клавиатуры два целых числа и
//выводит на экран следующие значения (каждое в отдельной строке):
//квадрат каждого числа (отдельно) и сумму квадратов введенных чисел.
public class z5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введиет 2 числа");

        int а, Ь, с;
        int a = in.nextInt();
        int b = in.nextInt();
        var c = a * a + b * b;
        System.out.println(a * a);
        System.out.println(b * b);
        System.out.println(c);
    }
}