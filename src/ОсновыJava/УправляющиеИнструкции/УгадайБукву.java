package ОсновыJava.УправляющиеИнструкции;

public class УгадайБукву {
        public static void main(String args[])
                throws java.io.IOException {
            char ch, answer = 'K';
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");
            ch = (char) System.in.read(); // чтение символа с клавиатуры
            if (ch == answer) System.out.println("** Правильно! **");
            else System.out.println("...Извините, вы не угадали.");
        }
    }
