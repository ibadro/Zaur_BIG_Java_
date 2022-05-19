
package Lesson26;

public class Test4 {
    
    // ПРИОРИТЕЗАЦИЯ ВЫЗОВОВ МЕТОДОВ
    void abc(int i){
        System.out.println("int");
    }
    void abc(byte i){
        System.out.println("byte");
    }
    void abc(long i){
        System.out.println("long");
    }
    
    public static void main(String[] args) {
        
        Test4 execution = new Test4();
        execution.abc(5); // int
        // БАЙ ДЕФОЛТ СРАБАТЫВАЕТ void abc(int i)
        // ЕСЛИ ЗАКОМЕНТИТЬ, ТО ДАЛЕЕ ИДЕТ void abc(long i)
        // ПОСЛЕДНИМ ЖЕ ИДЕТ void abc(byte i)
        
    }
    
}
