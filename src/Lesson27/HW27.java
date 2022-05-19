
package Lesson27;

import java.io.*;

public class HW27 {
    
    public static void main(String[] args) {
        
        Tiger2 tiger = new Tiger2();
        tiger.eat("myaso");
        
        try{
            tiger.drink("voda");
            
            try{
                tiger.drink("pivo");
            }
            catch(NeVodaException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("it's finally block");
            }   
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        
    }
    
}
// creation of 2 exceptions
class NeMyasoException extends RuntimeException{
    NeMyasoException(String message){
        super(message);
    }
}
class NeVodaException extends Exception{
    NeVodaException(String message){
        super(message);
    }
}

class Tiger2{

    void eat(String item){
        if (item.equals("myaso")) {
            System.out.println("Tiger eats myaso");
        } else {
            throw new NeMyasoException("Tigr doens't eat " + item);
        }
    }
    void drink(String item) throws NeVodaException{
        if (item.equals("voda")) {
            System.out.println("Tiger drinks voda");
        } else {
            throw new NeVodaException("Tigr doens't drink " + item);
        }
    }

}