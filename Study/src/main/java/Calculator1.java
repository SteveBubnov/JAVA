import java.util.ArrayList;
import java.util.Scanner;

/**
 * Реализация калькулятора, который работает с дробными числами
 */
public class Calculator1 {
    private float firstNum;
    private float secondNum;
    private int operation;

    //Вызов консоли ввода чисел
    public void inputNumbers() {
        System.out.println("Введите первое дробное число");
        firstNum = numberInput();
        System.out.println("Введите второе дробное число");
        secondNum = numberInput();
    }
    // метод ввода чисел
    private float numberInput() {
        float number;
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                number = scan.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Введенное значение не является дробным числом, повторите попытку");
            }
        }
        return number;
    }

    //вызов консоли для выбора операции
    public void operationInput() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите цифру, соответствующую желаемой операции");
                System.out.println("1 - Сложение");
                System.out.println("2 - Вычитание");
                System.out.println("3 - Умножение");
                System.out.println("4 - Деление");
                operation = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Введите целое число, соответствующее операции");
            }
        }
    }

    //результат
    public void calculation() {
        while (true) {
            try {
                switch (operation) {
                    case 1:
                        System.out.print("Результат: ");
                        System.out.printf("%.4f", addition());
                        break;
                    case 2:
                        System.out.print("Результат: ");
                        System.out.printf("%.4f", subtraction());
                        break;
                    case 3:
                        System.out.print("Результат: ");
                        System.out.printf("%.4f", multiplication());
                        break;
                    case 4:
                        System.out.print("Результат: ");
                        System.out.printf("%.4f", divicion());
                        break;
                    default:
                        throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Введите целое число, соответствующее операции");
                operationInput();

            }
        }
    }

    //Описание процесса сложения
    private float addition() {
        return firstNum + secondNum;
    }

    //Описание процесса вычитания
    private float subtraction() {
        return firstNum - secondNum;
    }

    //Описание процесса умножения
    private float multiplication() {
        return firstNum * secondNum;
    }

    //Описание процесса деления
    private float divicion() {
        return firstNum / secondNum;
    }


}


