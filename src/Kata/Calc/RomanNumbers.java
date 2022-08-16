package Kata.Calc;

enum RomanNumbers {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10), XX(20), XXX(30), XL(40), L(50), LX(60),
    LXX(70), LXXX(80), XC(90), C(100);
    final int number;
     RomanNumbers(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public static String getRoman(int number){
        String result = "";

        for (RomanNumbers num :
                RomanNumbers.values()) {
            if (num.number == number){
                result = num.toString();
            }
        }

        return result;
    }
}
