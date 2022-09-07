package Задачи;

import java.util.Scanner;

/*Напишите класс, который принимает с клавиатуры три числа: значения оснований трапеции и ее высоту.
Класс должен подсчитать и вывести на экран площадь этой трапеции.*/
public class z7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double a,b,h,s;
        a=in.nextDouble();
        b=in.nextDouble();
        h=in.nextDouble();
        s= 0.5*(a+b)*h;
        System.out.println(s);

    }
}
//2.37
