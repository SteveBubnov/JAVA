package HomeWork3Week.InputInterface;

import java.util.Scanner;

public class IntegerInput {

    public int input() {

        int number;
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                number = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Введенное значение не является целым числом, повторите попытку");
            }
        }
        return number;
    }
}
