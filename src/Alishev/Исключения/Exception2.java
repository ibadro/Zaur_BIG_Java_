package Alishev.Исключения;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScanerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {

                throw new ScanerException(" пользователь ввел не то");
            }
        }
    }
}
