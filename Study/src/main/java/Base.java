import java.util.Scanner;

/**
 * This is my first class (not really)
 */
public class Base {
    public static void main(String[] args) {
        int app;
        Scanner manul = new Scanner(System.in);
        System.out.println("Добро пожаловать в нашу программу!");
        System.out.println("Выберите операцию:");
        System.out.println("1 - Калькулятор");
        app = manul.nextInt();
        switch (app){
            case 1:
                calculator();
                break;
                default:
                    System.out.println("Выбрано некорректное значение");
        }

    }
    //Вызов калькулятора
    private static void calculator() {
        Calculator1 calculator1 = new Calculator1();
        calculator1.numberInput();
        calculator1.operationInput();
        calculator1.calculation();
    }
}

