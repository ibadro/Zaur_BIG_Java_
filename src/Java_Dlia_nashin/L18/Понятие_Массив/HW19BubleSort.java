
package Java_Dlia_nashin.L18.Понятие_Массив;

import java.util.Arrays;

//Создайте класс, в котором создайте метода сортировка. Инпут параметром данного метода будет одномерный массив
//типа Int. Метод должен возвращать уже отсортированный по возрастанию массив. Продемонстрируйте метод.
public class  HW19BubleSort {

    // bubble sort
    public static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }

            }

        }
    }


    public static void main(String[] args) {

        int[] arr = {8, 5, 6, 1};
        bubbleSort(arr); // buble sort of arr

        System.out.println(Arrays.toString(arr));


        int[] arr2 = {9, 8, 2, 7, 3, 4, 6, 1, 5, 0, -9};
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));


    }

}
