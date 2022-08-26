package Alishev;

public class Arrays_of_String {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 10;
//        System.out.println(num[0]);
//        System.out.println(num[1]);

        String[] str = new String[3];
        str[0] = "hi";
        str[1] = "hi222";
        str[2] = "hi12321232123";
//        System.out.println(str[1]);
//        System.out.println(str[2]);
//        System.out.println(str[0]);

        for (int i = 0; i < str.length; i++) {
            //     System.out.println(str[i]);
        }
        for (String xxx : str) {  //ххх - имя переменной   FOR EACH!!!!!!!!!!! Цикл проходится по каждому элементу массива
            System.out.println(xxx);

        }
        int[] numbers2 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers2) {
            sum = sum + x;
        }
        System.out.println("********");
        System.out.println(sum);


        int value = 0;
        String s;
    }
}
