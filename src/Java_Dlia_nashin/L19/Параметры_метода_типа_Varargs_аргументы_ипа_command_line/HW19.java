
package Java_Dlia_nashin.L19.Параметры_метода_типа_Varargs_аргументы_ипа_command_line;
//Создайте метод abc, инпут параметр которого N-oe количество массивов типа Стринг. В методе создайте новый массив, который будет состоять из элементов массивов- параметров и будет оутпутом данного метода.
//В методе main вызовите abc  и его элементам, которые равны значениям command line параметров, присвойте значение null. Выведите элементы обновленного массива на экран.
//Везде, где возможно, используйте foreach loop. Запустите задание с командной строки.

public class HW19 {
    public static String[] abc(String[]... array1) {  // warargs массивов стринг
    int length = 0;  // создаем переменную равной 0 потому что изначально не знаем длину массива
    for (String[] array2 : array1) { // прибавляем к переменной длины всех массивов в параметре String[]... array1
        length += array2.length;
    }
    String[] target = new String[length]; // создаем одномерный массив таргет с дилной ленс
    int count = 0;                          // создао переменную равной 0
    for (String[] array2 : array1) { // с помощью loop
        for (String s : array2) { //  каждому элементу таргет присваиваю определ значение
            target[count] =s;
            count++;
        }
    }
    return target;
}
    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "Privet", "poka"}, new String[]{"Ok", "helo","bye"}); // создаем еще один массив + еще массив
        for (String s : args) { //начинаем форич луп
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {  //если написать наоборот то будет выходить NullpointerException
                    target[i] = null;
                }
            }
        }
        for (String s : target) {
            System.out.println(s + " ");
        }
        System.out.println();
    }
}