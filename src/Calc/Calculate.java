package Calc;

  class Calculate {
    static void calc(String s) throws Exception {
        String arabicRegex = "-?\\d+(\\.\\d+)?";
        String[] inData = s.split("\\s");
        if (inData.length != 3) {
            throw new Exception("Что-то пошло не так, похоже введены данные не по формату");
        }
        if (inData[0].matches(arabicRegex) &
                inData[2].matches(arabicRegex) &
                Integer.parseInt(inData[0]) <= 10 &
                Integer.parseInt(inData[0]) > 0 &
                Integer.parseInt(inData[2]) <= 10 &
                Integer.parseInt(inData[2]) > 0
        ) {
            if (inData[1].equals(ArithmeticOperations.ADDITION.toString())) {
                System.out.println("Это сложение");
                System.out.println(Integer.parseInt(inData[0]) + Integer.parseInt(inData[2]));
            } else if (inData[1].equals(ArithmeticOperations.SUBTRACTION.toString())) {
                System.out.println("Это вычитание");
                System.out.println(Integer.parseInt(inData[0]) - Integer.parseInt(inData[2]));
            } else if (inData[1].equals(ArithmeticOperations.MULTIPLICATION.toString())) {
                System.out.println("Это умножение");
                System.out.println(Integer.parseInt(inData[0]) * Integer.parseInt(inData[2]));
            } else if (inData[1].equals(ArithmeticOperations.DIVISION.toString())) {
                System.out.println("Это деление");
                System.out.println(Integer.parseInt(inData[0]) / Integer.parseInt(inData[2]));
            } else throw new Exception("Это не математическая операция");
        } else throw new Exception("Что-то пошло не так. Возможно введено неправильное число, либо не соблюден формат ввода");
    }
}



