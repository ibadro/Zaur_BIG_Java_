package Alishev.ЗаписьВфайл;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("123");
        PrintWriter pw = new PrintWriter(file); // for text

        System.out.println(System.out);
        pw.println(" test 1laskjfdlkasjdflkjas;dflkjas;lkdfj;aldskjflakdsjf;alskjdf;lkadjsf;lkj");
        pw.close();

    }

}
