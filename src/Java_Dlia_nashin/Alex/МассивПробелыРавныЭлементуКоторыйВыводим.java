package Java_Dlia_nashin.Alex;

/* Создать массив из 10 элементов от 0 до 9 вывести элеменнты в каждой строке чтобы кол-во пробелов перед строкой было равно элементу который выводим.
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
        for (int a : array)
            for (int b:array)
            System.out.println(b=array.length+a);
        //   for (int i = 0; i < array.length; i++) {
        //      System.out.println(array[i]);

    }
}

