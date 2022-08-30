package Alishev.Исключения;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptio4 {

    public static void main(String[] args) {

        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException | IllegalAccessException e) { //мультикач
            e.printStackTrace();
       // } catch (IllegalAccessException e) {
      //      e.printStackTrace();
        }

    }
    public static void run() throws IOException, ParseException,IllegalAccessException{

    }
}
