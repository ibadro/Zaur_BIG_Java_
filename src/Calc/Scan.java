package Calc;

public class Scan {
    public static void romanScan(String s) throws Exception {
        String romanRegex = "(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        String[] inData = s.split("\\s");
        if (inData.length != 3) {
            throw new Exception("Что-то пошло не так, похоже введены данные не по формату");
        }
        if (inData[0].matches(romanRegex) &
                inData[2].matches(romanRegex) &
                RomanToArab.romanToArab(inData[0]) <= 10 &
                RomanToArab.romanToArab(inData[0]) > 0 &
                RomanToArab.romanToArab(inData[2]) <= 10 &
                RomanToArab.romanToArab(inData[2]) > 0
        ) {
            if (inData[1].equals(ArithmeticOperations.ADDITION.toString())) {
                System.out.println("Это сложение");
                System.out.println(RomanToArab.ArabToRoman((RomanToArab.romanToArab(inData[0]) + RomanToArab.romanToArab(inData[2]))));
            } else if (inData[1].equals(ArithmeticOperations.SUBTRACTION.toString())) {
                System.out.println("Это вычитание");
                System.out.println(RomanToArab.ArabToRoman(RomanToArab.romanToArab(inData[0]) - RomanToArab.romanToArab(inData[2])));
            } else if (inData[1].equals(ArithmeticOperations.MULTIPLICATION.toString())) {
                System.out.println("Это умножение");
                System.out.println(RomanToArab.ArabToRoman((RomanToArab.romanToArab(inData[0]) * RomanToArab.romanToArab(inData[2]))));
            } else if (inData[1].equals(ArithmeticOperations.DIVISION.toString())) {
                System.out.println("Это деление");
                System.out.println(RomanToArab.ArabToRoman(RomanToArab.romanToArab(inData[0]) / RomanToArab.romanToArab(inData[2])));
            } else throw new Exception("Это не математическая операция");
        } else throw new Exception("Что-то пошло не так");
    }
}