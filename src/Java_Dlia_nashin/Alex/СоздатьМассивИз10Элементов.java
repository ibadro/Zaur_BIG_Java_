package Java_Dlia_nashin.Alex;
/*Создать массив из 10 элементов [0,1,2,3,4,5,6,7,8,9], вывести на экран
вывод:
0
1
2
3
4
5
6
7
8
9
*/
import java.util.Arrays; // импортируем класс Arrays с нужными методами
public class СоздатьМассивИз10Элементов {

    public static void main(String[] args) {
        int array1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);

        }

    }
}
