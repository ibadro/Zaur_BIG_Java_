package Black_Belt.IO_NIO;

import java.io.FileWriter;
import java.io.IOException;

public class FWauctoclose {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной. \n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно\n" +
                "Вот последняя правда, открытая мной.\n";

        String s = "privet";

        try (FileWriter writer = new FileWriter("test55.txt", true);) { // автоматическое закрытие Try with resources
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            writer.write(s);
            System.out.println("done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

