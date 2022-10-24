package features;

public class Calculator {
    private double num1;
    private double num2;
    private char mathOperation;

    public Calculator(double num1, double num2, char mathOperation) {
        this.num1 = num1;
        this.num2 = num2;
        this.mathOperation = mathOperation;
    }

    public void calculate() {
        if (mathOperation == '-') {
            System.out.println(num1 - num2);
        } else if (mathOperation == '+') {
            System.out.println(num1 + num2);
        } else if (mathOperation == '/') {
            System.out.println(num1 / num2);
        } else if (mathOperation == '*') {
            System.out.println(num1 * num2);
        }
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }
}
