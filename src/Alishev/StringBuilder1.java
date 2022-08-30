package Alishev;

import java.util.Locale;

public class StringBuilder1 {
    public static void main(String[] args) {
//        String  str11 = "hello";
//        String  str21 = "hello";
//        String  str31 = "hello";
//        System.out.println(str11+str21+str31);
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.toString());
        sb.append(" sdf ").append(" asdfasd ");
        System.out.println(sb.toString());

    }
}
