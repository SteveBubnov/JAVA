package HomeWork3Week;

import HomeWork3Week.InputInterface.FloatInput;
import HomeWork3Week.InputInterface.IntegerInput;
import HomeWork3Week.MathCore.*;

public class Calculator {
    private float firstNumber;
    private float secondNumber;
    private int operationNumber;
    private PrintResult operation;

    public Calculator() {
    }

    public void setFirstNumber() {
        FloatInput floatInput = new FloatInput();
        System.out.println("Введите перове десятичное число");
        this.firstNumber = floatInput.input();


    }

    public void setSecondnumber() {
        FloatInput floatInput = new FloatInput();
        System.out.println("Введите второе десятичное число");
        this.secondNumber = floatInput.input();
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    private void setOperationNumber() {
        IntegerInput integerInput = new IntegerInput();
        System.out.println("Введите цифру, соответствующую желаемой операции");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        this.operationNumber = integerInput.input();
    }


    public void operation() {
        setOperationNumber();
        switch (operationNumber) {
            case 1:
                this.operation = new Addition();
                break;
            case 2:
                this.operation = new Subtraction();
                break;
            case 3:
                this.operation = new Multiplication();
                break;
            case 4:
                this.operation = new Division();
                break;
            default:
                System.out.println("Некорректная цифра операции.");
                operation();

        }
    }

    private float getOperationResult() {
        return operation.calculate(firstNumber, secondNumber);
    }

    public void printResult() {
        System.out.println(String.format("%.4f %s %.4f = %.4f", firstNumber, operation.getSign(), secondNumber, getOperationResult()));

    }
}
