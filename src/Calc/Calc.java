package Calc;
import java.util.Arrays;
public class Calc {

    public static int add(String source) {
        int sum = 0;
        if (source == null) {
            return 0;
        } else if (source.equals("")) {
            return 0;
        } else {
            source = proverkaNaPodstrokuVnachale(source);

            source = vozvedenieVStepen(source);

            source = source.replaceAll("\\D", ",");

            String[] s = source.split(",");

            sum += suma(s);
        }
        return sum;
    }

    static String proverkaNaPodstrokuVnachale(String s) {
        if (s.startsWith("//")) {
            int index = s.indexOf("\n");
            s = s.substring(index + 1);
        }
        return s;
    }


    static int suma(String[] s) {
        int suma = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("")) {
                continue;
            } else {
                int a = Integer.parseInt(s[i]);
                if (a > 0 && a < 1001) {
                    suma += a;
                }
            }
        }

        return suma;
    }

    static String vozvedenieVStepen(String s) {
        s = s.replaceAll("[^0-9^]", ",");
        for (int h = 0; h < s.length(); h++) {
            if (s.indexOf('^') > -1) {
                int indexStep = s.indexOf('^');
                if (s.charAt(indexStep + 1) >= '0' && s.charAt(indexStep + 1) <= '9') {
                    int osnovanieStepeni1 = Integer.parseInt(s.substring(indexStep - 1, indexStep));
                    int pokazatelStepeni = Integer.parseInt(s.substring(indexStep + 1, indexStep + 2));
                    double sum = Math.pow(osnovanieStepeni1, pokazatelStepeni);
                    String s1 = Double.toString(sum);
                    s = s.substring(0, indexStep - 1).concat("," + s1).concat(s.substring(indexStep + 2));
                } else {
                    int osnovanieStepeni1 = Integer.parseInt(s.substring(indexStep - 1, indexStep));
                    double sum = Math.pow(osnovanieStepeni1, 2);
                    String s1 = Double.toString(sum);
                    s = s.substring(0, indexStep - 1).concat("," + s1).concat(s.substring(indexStep + 1));

                }
            }
        }

        return s;
    }


    public static void main(String[] args) {
        System.out.println(add("2^4, 2^3"));
    }
}