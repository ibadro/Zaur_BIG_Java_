package Calc;

public class
RomanToArab {
    public static int romanToArab (String s) throws Exception {
        String[] numerals = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};

        int result = 0;
        for (int i = 0; i < numerals.length; i++) {
            while (s.startsWith(numerals[i])) {
                result += values[i];
                s = s.substring(numerals[i].length());
            }
        }
        if(result <= 0 | result > 100) {
            throw new Exception("Вы ввели неверное римское число");
        }
        return result;
    }

    public static String ArabToRoman (int num) {
        StringBuilder sb = new StringBuilder();
        int times;
        String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",
                "XC", "C", "CD", "D", "CM", "M" };
        int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,
                900, 1000 };
        for (int i = ints.length - 1; i >= 0; i--) {
            times = num / ints[i];
            num %= ints[i];
            while (times > 0) {
                sb.append(romans[i]);
                times--;
            }
        }
        return sb.toString();
    }
}
