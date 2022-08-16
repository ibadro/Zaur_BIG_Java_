package Calc;

  enum ArithmeticOperations {
    DIVISION("/"),
    MULTIPLICATION("*"),
    ADDITION("+"),
    SUBTRACTION("-");

    private final String value;

    ArithmeticOperations(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
