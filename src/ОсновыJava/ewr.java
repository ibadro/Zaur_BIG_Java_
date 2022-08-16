package ОсновыJava;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class ewr {
    static boolean arabikExpr(String expression) throws Exception {  //Проверяем арабские или римские цифры используем. Если арабские - TRUE, римские - FALSE
        String arabikTerms = "1234567890";
        String romeTerms = "IVXLCDM";
        if (arabikTerms.indexOf(expression.charAt(0)) != -1) return TRUE;
        else if (romeTerms.indexOf(expression.charAt(0)) != -1) return FALSE;
        else throw new Exception("throws Exception //т.к. строка не является математической операцией");
    }



    public static void main(String[] args) throws Exception {

        String s = "I+II";
        System.out.println(arabikExpr(s) );


    }
}

