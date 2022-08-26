package Alishev;

public class Massiv {
    public static void main(String[] args) {
      //  int[] numbers = {1, 2, 3};
        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// чтобы вывести на экран массив нам понадобятся 2 цикла for
        for (int i = 0; i < matrice.length; i++) { // внешний цикл будет проходиться по строкам, возвращает 3
            for (int j = 0; j < matrice[i].length; j++) { // цикл будет проходиться по столбцам
                System.out.print(matrice[i][j]+"  ");


            }
               System.out.println( ); // после каждого выполненного цикла будем переходить на новую строку
        }

//        String [][] str= new String[2][3];
//        str[0][1] = "Hi";
//        System.out.println(str[0][2]);
        }
    }
