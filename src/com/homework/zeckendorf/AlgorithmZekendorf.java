package com.homework.zeckendorf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlgorithmZekendorf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите положительное целочисленное значение: ");
        long n = in.nextLong();
        LongToFibonachiConvertor(n);
    }

    public static void LongToFibonachiConvertor(long n) {

        List<Long> listNumberFibonacci = new ArrayList<>();
        long fib1;
        long fib2 = 1;
        long fib3 = 1;
        StringBuilder str = new StringBuilder();
        boolean next = true;

        listNumberFibonacci.add(fib3);
        while (fib3 + fib2 <= n) {
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib1 + fib2;
            listNumberFibonacci.add(fib3);
        }

        for (int i = listNumberFibonacci.size() - 1; i >= 0; i--) {
            if (n >= listNumberFibonacci.get(i) && next) {
                str.append("1");
                n -= listNumberFibonacci.get(i);
                next = false;
            } else {
                str.append("0");
                next = true;
            }
        }

        System.out.println("Значение в Фибоначиевой системе исчисления: " + str);
    }
}
