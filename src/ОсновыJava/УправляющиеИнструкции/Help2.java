package ОсновыJava.УправляющиеИнструкции;
/*
Упражнение 3.2
Расширенная справочная система, в которой для обработки
результатов выбора из меню используется цикл do-while.
*/
public class Help2 {
    public static void main(String args[])
            throws java. io .IOException {
        char choice, ignore;
        do {
            System.out.println("Справка:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.print("Выберите: ");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n' ) ;
        } while( choice < '1' | choice > '5');
        System.out.println("\n");
        switch(choice) {
            case '1' :
                System.out.println("Инструкция i f : \n " );
                System.out.println(" i f (условие) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2' :
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность инструкций");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3' :
                System.out.println("Цикл for:\n");
                System.out.print("for(инициализация; условие; итерация)");
                System.out.println(" инструкция;");
                break;
            case '4' :
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) инструкция;");
                break;
            case '5' :
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println(" инструкция;");
                System.out.println("} while (условие);");
                break;

}
    }
}
/* Обратите внимание на вложенные циклы d o -w h ile , используемые с целью
избавиться от нежелательных символов, оставшихся во входном буфере.
После внесения приведенных выше изменений программа будет отображать
меню в цикле до тех пор, пока пользователь не введет числовое значение
в пределах от 1 до 5. */