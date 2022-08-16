package Kata.Calc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Чтобы воспользоваться калькулятором введите значения");
        while (true){
            System.out.println("Вводи строку");
            System.out.println( "Результат: " + calc(scan.nextLine()));
        }
    }

    public static String calc(String input) throws Exception{
        Calculator calc = new Calculator(input);
        if (calc.isRoman){
            return Converter.convertToRom(calc.calculate());
        }
        else return calc.calculate() + "";
    }

}
