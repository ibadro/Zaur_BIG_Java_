
package Java_Dlia_nashin.L19.Параметры_метода_типа_Varargs_аргументы_ипа_command_line;

public class Test8 {
    
    public static void main(String[] args) {
        
        int [] arr1 = {1,2,3};
        int [] arr2 = {-1,-2,-3};
        
        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            arr1[i] = 12;
            arr2[i] = 3;
        }// внутри одного фор лупа меняем динамически содержимое двух массивов
        
        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            System.out.print(arr1[i] + " ");
            System.out.println(arr2[i] + " ");
        }
        
        
        
        
    }
    
}
