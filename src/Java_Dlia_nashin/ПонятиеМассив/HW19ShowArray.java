
package Java_Dlia_nashin.ПонятиеМассив;

//Создайте класс, в котором создайте метод showArray. Инпут параметром данного метода будет двуменрный массив типа Стрингю
//Метод должен выводить на экран данный массив в следующем виде:{{элемент00, элемент01},{элемент10},{эдемент10, элемент11}}
//Сожержимое, естественно, будет зависеть от Вашего массива.
//Продементстрируйте метод
public class HW19ShowArray {

    static void showArray(String arr[][]) {

        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print("{ ");
            for (int j = 0; j < arr[i].length; j++) {

                if (j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + ", ");
                } else {
                    System.out.print(arr[i][j]);
                }

            }

            if (i != arr.length - 1) {
                System.out.print(" }, ");
            } else {
                System.out.print(" }");
            }

        }
        System.out.println(" }");

    }

    public static void main(String[] args) {

        String arr[][] = {{"apple", "banana"}, {"hi", "world"}, {"car"}};
        showArray(arr);

    }

}
//{ {apple,orange}, {hello,bye,ok}, {car}  }
//        { {man,woman}, {male,female}  }