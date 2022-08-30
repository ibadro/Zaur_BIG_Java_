package Alishev;

public class Arrays {
    public static void main(String[] args) {
        int i1 = 10;// примитив
        char ch = 's'; // примитив
        int[] numbers = new int[50];//массив numbers -> [massiv] ссылочный тип данных
        // System.out.println(numbers[3]); // 0 1 2 3 4
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((i * 7) / 2) * 45; //инициализация массива


        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] numbers2 = {1, 2, 3};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
