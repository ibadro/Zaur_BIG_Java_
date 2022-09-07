package Задачи;

import java.util.Scanner;

/*Напишите класс, который принимает с клавиатуры целое число и затем выводит на экран его квадрат.*/
public class Z2 {

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {


        int a;
        int b;

        a = in.nextInt();
        b = a*a;

        System.out.println("квадрат введеног вами числа   " +b);


    }
}
