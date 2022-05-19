
package Lesson27;

public class Test4_3 {
    
    void abc() throws NullPointerException{ // метод абс может выбросить NullPointerException
        // throws NullPointerException можно НЕ ОБЪЯВЛЯТЬ ЭТО ДЛЯ РАНТАЙМ ЭКСЕПШЕНОВ
        // throws NullPointerException - ОБЪЯВЛЕНИЕ ЭКСЕПШЕНА
        String s = null;
        System.out.println(s.length());
    }
    
    public static void main(String[] args){ // throws ArrayIndexOutOfBoundsException
                                // можно не писать , потому что это рантайм эксепшен
                                // его можно не объявлять
        
        int [] arr1 = {1, 2, 3};
        
        try{
            System.out.println(arr1[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException was catched");
        }
        // файнал блок можем не писать 
        
    }
    
}
