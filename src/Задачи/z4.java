package Задачи;

import java.util.Scanner;
// Задача: Напишите класс который выводит "песчаные часы" из заданого символа и количества шагов.
public class z4 {

        public static String sim;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введи символ:");
            sim = sc.nextLine();
            System.out.println("Введи количество:");
            int a=sc.nextInt();
            draw(a);

        }
        public static void draw(int w){
            draw(w, 0);
        }

        public static void draw(int W, int s){
            stars(W, s);
            if (W > 2) {
                draw(W-2, s+1);
                stars(W, s);
            }
        }
        public static void stars(int n, int s){
            if(s > 0){
                System.out.print(" ");
                stars(n, s-1);
            } else  if (n > 0){
                System.out.print(sim);
                stars(n-1, s);
            } else {
                System.out.println();
            }
        }


}
