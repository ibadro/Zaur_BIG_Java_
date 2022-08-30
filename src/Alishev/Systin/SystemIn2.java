package Alishev.Systin;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class SystemIn2 {

    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "big-new" + separator + "Desktop" + separator + "2.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line =  scanner.nextLine();
        String[] nembStr = line.split(" ");
        int[] numbers = new int[55];
        int counter= 0;
        for(String number : nembStr) {
            numbers[counter++] = Integer.parseInt((number));
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();




    }
}