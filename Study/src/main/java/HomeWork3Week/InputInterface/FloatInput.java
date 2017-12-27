package HomeWork3Week.InputInterface;

import java.util.Scanner;

public class FloatInput {

    public float input() {
        float number;
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                number = scan.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Введенное значение не является десятичным числом, повторите попытку");
            }
        }
        return number;
    }


}
