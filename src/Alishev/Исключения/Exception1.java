package Alishev.Исключения;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args)   {
        File file = new File("123"); //Java сама надет файл если она лежит в корне проекта
        try {
            Scanner scanner = new Scanner(file);
            System.out.println(" после сканер");
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.out.println(" фаил не найден");
        }
        System.out.println(" полсе блока трай катч");
    }

}
