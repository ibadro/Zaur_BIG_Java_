
package Lesson27;

public class Test12_2 {

    void abc(){
        
        int [] arr = {1, 2, 3};
        
        try{
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            
            String s = null;
            
            try{
                System.out.println(s.length());
            }
            
            catch(NullPointerException e2){
            System.out.println("NullPointerException is catched");
            }
            
        }
        
        
    }
    
    public static void main(String[] args) {
        
        Test12_2 t = new Test12_2();
        t.abc(); // NullPointerException is catched
        // таким образом ясно, что выражения, которые могут вызывать эксепшены
        // нужно помещать в трай, и необходимо учитывать вложенность
        // нестед трайк, кэч блоков

        
    }
    
}
