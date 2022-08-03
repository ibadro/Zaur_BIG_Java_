
package Java_Dlia_nashin.L15.Циклы_While_и_Do_While;

public class Test8_2СозданиеЧасов {
    
    public static void main(String[] args) {
        
        OUTER: for (int chas = 0; chas <= 24; chas++) {
            
            int minuta = 0;
            
            INNER: while(minuta < 60) {
                
                if(minuta % 2 == 0) {
                    continue OUTER; // все четные часы мы ПРОПУСКАЕМ
                }
                
                System.out.println(chas + ":" + minuta);
                minuta++;
                
            }

        }

    }
    
}
