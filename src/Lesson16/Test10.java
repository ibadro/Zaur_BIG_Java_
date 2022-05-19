
package Lesson16;

public class Test10 {
    
    public static void main(String[] args) {
        
        String s1 = "Если вы хотите прожить как можно дольше. Вам стоит обязательно ознакомиться со списком полезных привычек";
        String s2 = s1.toUpperCase();
        
        char c1;
        char c2;
        
        for (int i = 0; i < s1.length(); i++) { // пока i меньше длинны строки s1
            
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            
            if ((c1 != '.') && (c1 != ' ') && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            
            System.out.print(c1);
            
        } // цикл перебирает все чары, если видит большую букву, то текст начинается с новой строки
        
        System.out.println();
        
    }
    
}
