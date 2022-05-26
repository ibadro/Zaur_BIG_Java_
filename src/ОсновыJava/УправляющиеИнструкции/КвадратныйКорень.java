package ОсновыJava.УправляющиеИнструкции;

// Вывод квадратных корней чисел от 1 до 99
// вместе с ошибкой округления
public class КвадратныйКорень {
    public static void main(String args[]) {
        double num, sroot, rerr;
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num +
                    " равен " + sroot);
// Вычисление ошибки округления
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}
/*Обратите внимание на то, что ошибка округления вычисляется путем возведения
в квадрат квадратного корня числа. Полученное значение вычитается
из исходного числа.*/