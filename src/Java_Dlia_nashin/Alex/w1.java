package Java_Dlia_nashin.Alex;

public class w1 {
    public static void main(String[] args) {
        // Массива myArray из 5 элементов типа double.
        double[] myList = {11.5, 1.9, 5.32, 8.8, 15.8,10};

        // Вывод четных элементов массива на экран.
        System.out.print("Четные элементы массива myList: ");
        for (int i = 0; i < myList.length; i++) {
            if(myList[i]%2 == 0){
                System.out.print(myList[i] + ", ");
            }
        }
        // Вывод элементов массива с нечетным индексом на экран.
        System.out.print("\nЭлементы массива myList с нечетным индексом: ");
        for (int i = 0; i < myList.length; i++) {
            if(i%2 != 0){
                System.out.print("индекс " + i + " = " + myList[i] + ", ");
            }
        }
        }
    }

