
package Lesson19;


public class HW19 {
    
    static void arrOutput(StringBuilder [] output) {
    
        for (StringBuilder i:output) {
            System.out.println(i);
        }
    
    }
    
    static void abc(String [] ... arr) {
    
        StringBuilder output = new StringBuilder();
        
        for(String [] innerArr:arr) {
            
            for(String arrItem:innerArr) {
                output.append(arrItem + " ");    
            }
        
        }

        StringBuilder [] outputArr = new StringBuilder [] {output};
        arrOutput(outputArr);

    }
    
    public static void main(String[] args) {
        
        String [] s1 = {"a", "b", "c"};
        String [] s2 = {"a1", "b1", "c1"};
        String [] s3 = {"a2", "b2", "c2"};
        
        abc(s1,s2,s3);  
        
        for (int i = 0; i < s1.length; i++) {
            
        }
        
    }
    
}
