import java.util.Scanner;

/**
 * This is my first class (not really)
 */
public class Base extends Calculator1 {
    public static void main(String[] args) {
        int app;
        MaxMassive maxMassive = new MaxMassive();
        System.out.println("Добро пожаловать в нашу программу!");
        while (true) {
            try {

                Scanner manul = new Scanner(System.in);

                System.out.println("Выберите операцию:");
                System.out.println("1 - Калькулятор");
                System.out.println("2 - Самое длинное слово массива");
                app = manul.nextInt();
                switch (app) {
                    case 1:
                        calculator();
                        break;
                    case 2:
                        maxMassive.massive();
                        break;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Выбрано некорректное значение, повторите попытку");
            }
            break;
        }


    }

}
