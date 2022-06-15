package Java_Dlia_nashin.Alex;
/*Создать массив из 100 элементов от 1 до 100, вывести на экран только четные элементы
2
4
6
8
10
...
100*/
public class ЧетныеЭлементы {

        public static void main(String[] args) {
            int []array2 =  new int [101];

            for (int i = 1; i<array2.length; i++) {
                array2[i] = i;
                if(i%2 ==0)
                  System.out.println(array2[i]);

            }
        }
    }