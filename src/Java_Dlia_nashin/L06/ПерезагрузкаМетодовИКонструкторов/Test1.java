
package Java_Dlia_nashin.L06.ПерезагрузкаМетодовИКонструкторов;

public class Test1 {
    
    int sum (int a, int b, int c) {

        return a + b + c;
    
    }
    
    int averageNumb (int z, int x, int v) {
    
        return sum(z, x, v) / 3;
        // вызвали ф-ию внутри ф-ии
        
    }
    
}
