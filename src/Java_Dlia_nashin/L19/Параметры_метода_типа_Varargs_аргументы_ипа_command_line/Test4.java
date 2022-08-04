
package Java_Dlia_nashin.L19.Параметры_метода_типа_Varargs_аргументы_ипа_command_line;

public class Test4 {
 
    public static void main(String[] args) {
        
        int [] arr = {0, 6, 4, 1};
        
        int summ = 0;
        
        // foreach loop, который складывает все элементы массива arr
        for(int a:arr) {
            summ += a;
        }
        System.out.println(summ);
        
        
    }
    
}
