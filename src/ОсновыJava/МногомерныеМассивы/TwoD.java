package ОсновыJava.МногомерныеМассивы;
// Демонстрация использования двумерного массива
public class TwoD {
    public static void main(String args[]) {
        int t, i;
        int table[][] = new int[3][4];
        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();

        }
    }
}
/*В данном примере кода элемент t a b l e [0] [0] будет содержать значение 1,
элемент ta b le [ 0 ] [ 1 ] — значение 2, элемент ta b le [ 0 ] [ 2 ] — значение 3 и т.д.,
а элемент ta b le [2] [3] — значение 12. Структура данного массива представлена
в наглядном виде на рис. 5.1.*/