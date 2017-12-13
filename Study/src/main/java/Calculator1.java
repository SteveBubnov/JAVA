import java.util.Scanner;

/**
 * Реализация калькулятора, который работает с дробными числами
 */
public class Calculator1 extends Base{
    float firstNum;
    float secondNum;
    int operation;
    Scanner scanner = new Scanner(System.in);



    //вызов консоли для ввода чисел
    public void numberInput() {

        System.out.println("Введите первое число");
        firstNum = scanner.nextFloat();
        System.out.println("Введите второе число");
        secondNum = scanner.nextFloat();

    }

    //вызов консоли для выбора операции
    public void operationInput(){
        System.out.println("Введите цифру, соответствующую желаемой операции");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        operation = scanner.nextInt();
    }

    //результат
    public void calculation(){
        switch (operation){
            case 1:
                System.out.printf("%.4f", addition());
                break;
            case 2:
                System.out.printf("%.4f", subtraction());
                break;
            case 3:
                System.out.printf("%.4f", multiplication());
                break;
            case 4:
                System.out.printf("%.4f", divicion());
                break;
                default:
                    System.out.println("Неправильное значение операции, перезапустите программу");
        }
    }

    //Описание процесса сложения
    public float addition(){
        return firstNum + secondNum;
    }

    //Описание процесса вычитания
    public float subtraction(){
        return firstNum - secondNum;
    }

    //Описание процесса умножения
    public float multiplication(){
        return firstNum*secondNum;
    }
    //Описание процесса деления
    public float divicion(){
        return firstNum/secondNum;
    }


}
