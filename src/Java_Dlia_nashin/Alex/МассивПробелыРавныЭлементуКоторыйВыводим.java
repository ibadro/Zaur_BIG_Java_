package Java_Dlia_nashin.Alex;

/* Создать массив из 10 элементов от 0 до 9 вывести элементы в каждой строке чтобы кол-во пробелов перед строкой было равно элементу который выводим.
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
          10*/
public class МассивПробелыРавныЭлементуКоторыйВыводим {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 10; i++) {

            // int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            // for (int a : array)
            //    for (int b:array)
            //System.out.printf("%-10d \n", + i +  i );

                 System.out.print(" ".repeat(i));
                 System.out.println(array[i]);

        }
    }}


