package Java_Dlia_nashin.Alex;
/*Создать массив из 100 элементов от 1 до 100, вывести на экран только элементы с четными индексами
3
5
7
...
99
*/
import java.util.Arrays; // импортируем класс Arrays с нужными методами
public class ЧетныеИндексы {
    public static void main(String[] args) {
        int[] myList = new int [101];

        System.out.print("Элементы массива myList с четным индексом: ");
        for (int i = 2; i < myList.length; i++) {
            myList[i] = i;
            if(i%2 != 0){
                System.out.print( + myList[i] + ", ");
            }
        }

    }
}