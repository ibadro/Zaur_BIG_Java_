
package Lesson23;

public class Test10 {
 
    public static void main(String[] args) {
        
        B10 b = new B10();
        System.out.println(b.s1); // privet hi
        
        
        b.summ2(2,3,4,5); // 14
        // то есть при помощи слова супер, я могу работать с родиетельскими методами
        // и переменными внутри детей
        
    }
    
}

class A10{
    String s1 = "privet";
    
    int summa(int ... a){ // varargs
        
        int result = 0;
        for(int i:a){ // foreach
            result += i;
        }
        return result;
    }
    
}

class B10 extends A10{
// при помощи super.s1 - мы обращаемся к переменной s1 из родителя А10
// просто String s1 = s1 + " hi"; --- мы сделать не можем, потому что String s1 - хайд
    String s1 = super.s1 + " hi";
    
    int summ2(int ... b){
        
        int result1 = super.summa(b); // результат выполнения метода из родителя
        //  A10 при помощи ключевого слова супер присваиваем переменной  result1
        System.out.println(result1);
        return result1;
        
    }
    
}