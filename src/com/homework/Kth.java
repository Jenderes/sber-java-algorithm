package com.homework;

import java.util.Scanner;

public class Kth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите индекс значения: ");
        long indexNumber = in.nextLong() + 1;
        long stepFind = 1;
        while (indexNumber > (stepFind * 9 * powTen(stepFind - 1))) {
            indexNumber -= stepFind * 9 * powTen(stepFind - 1);
            stepFind++;
        }
        long indexOnNumber = indexNumber % stepFind;
        if (indexOnNumber != 0) {
            long changeNumber = powTen(stepFind - 1) + (indexNumber / stepFind);
            long withoutUp = changeNumber % powTen(stepFind - indexOnNumber + 1);
            long result = withoutUp / powTen(stepFind - indexOnNumber);
            System.out.println("Значение по индексу равно: " + result);
        } else {
            long changeNumber = powTen(stepFind - 1) + (indexNumber / stepFind) - 1;
            System.out.println("Значение по индексу равно: " + changeNumber % 10);
        }
    }

    private static long powTen(long step) {
        long pow = 1;
        if (step == 0) {
            return 1;
        }
        for (int i = 0; i < step; i++) {
            pow *= 10;
        }
        return pow;
    }
}
