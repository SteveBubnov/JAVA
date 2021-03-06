package Lesson4;

import java.util.ArrayList;
import java.util.Random;

/**
 * Задача 1
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. Найти максимальный отрицательный и
 * минимальный положительный элементы массива. Поменять их местами.
 */
public class MassiveExcercise4 {
    private static ArrayList<Integer> massive = getRandomNumber();
    private static int maxNegativeNumber = getMaxNegative();
    private static int maxNegativeNumberInd = getMaxNegativeIndex();
    private static int minPositiveNumber = getMinPositive();
    private static int minPositiveNumberInd = getMinPositiveIndex();
    private static int i;

    public static void main(String[] args) {
        massive.set(maxNegativeNumberInd, minPositiveNumber);
        massive.set(minPositiveNumberInd, maxNegativeNumber);
    }

    // создание массива из случайных чисел
    private static ArrayList<Integer> getRandomNumber() {
        Random rnd = new Random();

        ArrayList<Integer> numbersGenerated = new ArrayList<Integer>();

        for (i = 0; i < 20; i++) {
            int randomNumber = rnd.nextInt(21) - 10;
            numbersGenerated.add(randomNumber);

        }
        i = 0;
        return numbersGenerated;
    }

    //Получение максимального отрицательного числа
    private static int getMaxNegative() {
        int maxNegative = 0;
        if (massive.get(0) < 0) {
            maxNegative = massive.get(0);
        }
        for (i = 1; i < 20; i++) {
            if (massive.get(i) < 0) {
                if (massive.get(i) > maxNegative) {
                    maxNegative = massive.get(i);
                } else if (maxNegative == 0) {
                    maxNegative = massive.get(i);
                }
            }
        }
        i = 0;
        return maxNegative;
    }

    //Получение индекса максимального отрицательного числа
    private static int getMaxNegativeIndex() {
        int maxNegativeI = -1;
        int maxNegativeIndex = 0;
        if (massive.get(0) < 0) {
            maxNegativeIndex = massive.get(0);
            maxNegativeI = 0;
        }
        for (i = 1; i < 20; i++) {
            if (massive.get(i) < 0) {
                if (massive.get(i) > maxNegativeIndex) {
                    maxNegativeIndex = massive.get(i);
                    maxNegativeI = i;
                } else if (maxNegativeIndex == 0) {
                    maxNegativeIndex = massive.get(i);
                    maxNegativeI = i;
                }
            }
        }
        i = 0;
        return maxNegativeI;
    }

    //Получение минимального положительного числа
    private static int getMinPositive() {
        int minPositive = 0;
        if (massive.get(0) > 0) {
            minPositive = massive.get(0);
        }
        for (i = 1; i < 20; i++) {
            if (massive.get(i) > 0) {
                if (massive.get(i) < minPositive) {
                    minPositive = massive.get(i);
                } else if (minPositive == 0) {
                    minPositive = massive.get(i);
                }
            }
        }
        return minPositive;
    }

    //Получение индекса минимального положительного числа
    private static int getMinPositiveIndex() {
        int mixPositiveI = -1;
        int mixPositiveIndex = 0;
        if (massive.get(0) > 0) {
            mixPositiveIndex = massive.get(0);
            mixPositiveI = 0;
        }
        for (i = 1; i < 20; i++) {
            if (massive.get(i) > 0) {
                if (massive.get(i) < mixPositiveIndex) {
                    mixPositiveIndex = massive.get(i);
                    mixPositiveI = i;
                } else if (mixPositiveIndex == 0) {
                    mixPositiveIndex = massive.get(i);
                    mixPositiveI = i;
                }
            }
        }
        return mixPositiveI;
    }
}