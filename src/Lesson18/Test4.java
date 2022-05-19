
package Lesson18;

public class Test4 {
    
    public static void main(String[] args) {
        
        String [] array1;
        array1 = new String[3]; // длина одномерного массива - 3
        
        for (int i = 0; i < array1.length; i++) {
            array1[i] = "privet" + i;
            System.out.println(array1[i]);
            // privet0
            // privet1
            // privet2
            // потому что длинна массива = 3 (array1 = new String[3];)
        }
 
        int [][] array2;
        array2 = new int[3][]; // 3 одномерных массива,длинны которых РАЗНЫЕ
   
        array2[0] = new int[5]; // длинна первого одномерного массива = 5
        array2[1] = new int[2]; // длинна второго одномерного массива = 2
        array2[2] = new int[7]; // длинна третьего одномерного массива = 7
        
        for (int i = 0; i < array2.length; i++) { // пробегаем по количеству одномерных массивам - их 3
            
            for (int j = 0; j < array2[i].length; j++) { // пробегаем по каждому их этих массивов
                array2[i][j] = i + j;
                System.out.println(array2[i][j]);
                // инициализация двухмерного массива
            }
        }
        
        System.out.println("***");
        
        System.out.println(array2[1][1]);
        
        
    }
    
}
