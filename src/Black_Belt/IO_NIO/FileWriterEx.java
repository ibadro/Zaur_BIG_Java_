package Black_Belt.IO_NIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной. \n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно\n" +
                "Вот последняя правда, открытая мной.\n";
       String s = "privet";
        FileWriter writer = null;
        try {
          //  writer = new FileWriter("C:\\Users\\big-new\\Desktop\\test.txt"); // или другая директория
          writer = new FileWriter("test55.txt", true);
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));

       //     }
            //  альтернативный вариант записи
          // writer.write(rubai );
            writer.write(s);
            System.out.println("done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
