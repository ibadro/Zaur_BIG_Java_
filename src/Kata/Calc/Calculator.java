package Kata.Calc;

 class Calculator {
    int number1;
    int number2;
    char sign;
    boolean isRoman;

    Calculator(String task) throws Exception {
        String[] numbers = task.toUpperCase().split("[+-/*]");
        if (numbers.length > 2){
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        else if(numbers.length < 2){
            throw new Exception("Cтрока не является математической операцией");
        }

        try{
            number1 = Integer.parseInt(numbers[0]);
            number2 = Integer.parseInt(numbers[1]);
            isRoman = false;
        }
        catch (NumberFormatException e){
            try{
                RomanNumbers num1 = RomanNumbers.valueOf(numbers[0]);
                RomanNumbers num2 = RomanNumbers.valueOf(numbers[1]);
                number1 = num1.getNumber();
                number2 = num2.getNumber();
                isRoman = true;
            }
            catch (IllegalArgumentException exception) {
                throw new Exception("Используются одновременно разные системы счисления");
            }
        }
        sign = task.charAt(numbers[0].length());
    }

     int calculate() {
        int result = 0;
        switch (sign){
            case '+':
                result = this.number1 + this.number2;
                break;
            case '-':
                result = this.number1 - this.number2;
                break;
            case '*':
                result = this.number1 * this.number2;
                break;
            case '/':
                result = this.number1 / this.number2;
                break;
        }
        return result;

    }
}
