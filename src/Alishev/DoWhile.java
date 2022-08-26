package Alishev;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //       System.out.println(" Введи 5");
        //       int i = scanner.nextInt();
//        while (i!=5){
//            System.out.println(" Введи 5");
//            i=scanner.nextInt();
//        }
//        System.out.println(" Вы ввели 5");
//    }
        int i;

        do {
            System.out.println(" Введи 5");
            i = scanner.nextInt();
        } while (i != 5);

        System.out.println(" Вы ввели 5");
    }
}
