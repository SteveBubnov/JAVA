import java.util.Scanner;

public class MaxMassive {
    private Scanner scanWord = new Scanner(System.in);
    private int massLength;
    private String[] mass;

    public void massive() {
        inputLength();
        inputWords();
        maxWordSearch();
    }

    private void inputLength() {
        while (true) {
            try {
                Scanner masScan = new Scanner(System.in);
                System.out.println("Введите размер массива");
                massLength = masScan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Введите целочисленное значение");
            }
        }
        mass = new String[massLength];
    }

    private void inputWords() {
        System.out.println("Введите слова в массив");
        for (int v = 0; v < massLength; v++) {
            System.out.printf("Введите %d-e слово массива", v);
            System.out.println("");
            mass[v] = scanWord.nextLine();
        }
    }

    private void maxWordSearch() {
        String maxWord = mass[0];
        for (int i = 1; i < massLength; i++) {
            if (mass[i].length() > maxWord.length()) {
                maxWord = mass[i];
            }
        }
        System.out.print("Самое большое слово массива: " + maxWord);
    }
}
