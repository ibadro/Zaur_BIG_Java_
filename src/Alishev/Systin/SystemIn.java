package Alishev.Systin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) throws FileNotFoundException {
        String separator =File.separator;
        String path = separator +"Users"+ separator+"big-new" +separator +"Desktop" +separator+ "2.txt";

        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();


    }
}
