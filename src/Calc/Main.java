package Calc;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        String arabicRegex = "-?\\d+(\\.\\d+)?";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите операцию");
        String myString = in.nextLine();
        in.close();
        String[] inData = myString.split("\\s");
        if(inData[0].matches(arabicRegex)) {
            Calculate.calc(myString);
        }
        else Scan.romanScan(myString);
    }
}
