
package Java_Dlia_nashin.L15.Циклы_While_и_Do_While;

public class Test4 {
    
    public static void main(String[] args) {
        
        int a = 5;
        
        while(++a > 10 ) { // первая инкрементация пройдет и перезапишет своё значение в а
            a++;
        }
        
        System.out.println(a); // 6
        //
        
    }
    
}
