package Alishev;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("in vozrast");
        String age = scanner.nextLine(); // int age = scanner.nextInt();
        switch (age){
            case "0" :
                System.out.println( "Ты родился");
                break;
            case "sdf" :
                System.out.println("sdf");
                break;
            case "sdfsdfsf":
                System.out.println("sdfsadfasdf");
                break;
            default:
                System.out.println(" ни одно условие");
        }
    }
}
