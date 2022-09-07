package Задачи;

import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры два целых числа,
образующих ответ на вопрос «который час?» (первое - часы, второе -
минуты, например, 15 и 42) и выводит на экран следующие значенияКоманды вывода. Команды ввода 15
(каждое в отдельной строке): сколько секунд прошло с полуночи до
«данного момента» и сколько минут прошло за это же время, а также
сколько минут осталось до полуночи.*/
public class z6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int hours, minutes, seconds, minutesl, minutes2;
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = hours * 3600 + minutes * 60;
        System.out.println(seconds);
        minutesl = hours * 60 + minutes;
        System.out.println(minutesl);
        minutes2 = 24 * 60 - minutesl;
        System.out.println(minutes2);

    }
}

