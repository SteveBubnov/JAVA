package Lesson4;

import java.util.ArrayList;
import java.util.Random;

public class MassiveExcercise4 {
    private static ArrayList<Integer> massive = getRandomNumber();
    private static int maxNegativeNumber = getMaxNegative();
    private static int maxNegativeNumberInd =  getMaxNegativeIndex();
    private static int minPositiveNumber = getMinPositive();
    private static int minPositiveNumberInd = getMinPositiveIndex();
    private static int i;

    public static void main(String[] args){
        massive.set(maxNegativeNumberInd, minPositiveNumber);
        massive.set(minPositiveNumberInd, maxNegativeNumber);
    }


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
    private static int getMaxNegative(){
        int maxNegative = 0;
        if (massive.get(0) <0){
            maxNegative = massive.get(0);
        }
        for (i = 1; i<20; i++){
            if(massive.get(i)<0){
                if(massive.get(i)>maxNegative){
                    maxNegative = massive.get(i);
                }
                else if(maxNegative == 0){
                    maxNegative = massive.get(i);
                }
            }
        }
        i=0;
        return maxNegative;
    }
    private static int getMaxNegativeIndex(){
        int maxNegativeI = -1;
        int maxNegativeIndex = 0;
        if (massive.get(0) <0){
            maxNegativeIndex = massive.get(0);
            maxNegativeI = 0;
        }
        for (i = 1; i<20; i++){
            if(massive.get(i)<0){
                if(massive.get(i)>maxNegativeIndex){
                    maxNegativeIndex = massive.get(i);
                    maxNegativeI = i;
                }
                else if(maxNegativeIndex == 0){
                    maxNegativeIndex = massive.get(i);
                    maxNegativeI = i;
                }
            }
        }
        i = 0;
        return maxNegativeI;
    }

    private static int getMinPositive(){
        int minPositive = 0;
        if (massive.get(0) > 0){
            minPositive = massive.get(0);
        }
        for (i = 1; i<20; i++){
            if(massive.get(i)>0){
                if(massive.get(i)<minPositive){
                    minPositive = massive.get(i);
                }
                else if(minPositive == 0){
                    minPositive= massive.get(i);
                }
            }
        }return minPositive;
    }
    private static int getMinPositiveIndex(){
        int mixPositiveI = -1;
        int mixPositiveIndex = 0;
        if (massive.get(0) >0){
            mixPositiveIndex = massive.get(0);
            mixPositiveI = 0;
        }
        for (i = 1; i<20; i++){
            if(massive.get(i)>0){
                if(massive.get(i)<mixPositiveIndex){
                    mixPositiveIndex = massive.get(i);
                    mixPositiveI = i;
                }
                else if(mixPositiveIndex == 0){
                    mixPositiveIndex = massive.get(i);
                    mixPositiveI = i;
                }
            }
        }return mixPositiveI;
    }

    public static void print(){
        for (int b = 0;b<20; b++){
            System.out.println(massive.get(b));

        }
        System.out.println("Максимальное отрицательное = " + maxNegativeNumber + " Под индексом " + maxNegativeNumberInd);
        System.out.println("Минимальное положительное = " + minPositiveNumber + " Под индексом " + minPositiveNumberInd);
    }


}