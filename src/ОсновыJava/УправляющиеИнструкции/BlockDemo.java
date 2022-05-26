package ОсновыJava.УправляющиеИнструкции;

public class BlockDemo {
    public static void main(String args[]) {
        double i, j, d;
        i = 5;
        j = 10;
// Телом этой инструкции if является целый блок кода
        if (i != 0) {
            System.out.println("i не равно нулю"); // Телом оператора i f  является весь блок
            d = j / i;
            System.out.print("j / i равно " + d);

        }
    }
}
