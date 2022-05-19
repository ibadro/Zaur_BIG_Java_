
package Lesson27;

import java.io.*; // пакет с классами и интерфейсами для чтения или записи документов

public class Test3 {
    
    public static void main(String[] args) throws Exception {
        
        File f = new File("test9.txt"); // абстрактный адрес файла test10.txt
        FileInputStream fis = new FileInputStream(f); // поток для считывания инфы с test10.txt
        System.out.println("файл найден");
        fis.read();
        
//        FileOutputStream fos = new FileOutputStream(f); // поток для записи инфы в test10.txt
//        fos.write(100); // записываем в test10.txt чар с порядковым номером 100, то есть d
        
    }
    
}
