package com.bytesw.evaluacion;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        int number = 2;
        while (primeNumbers.size() < 10) {
            if (isPrimeNumber(number)) {
                primeNumbers.add(number);
            }

            number++;
        }

        System.out.println("Los diez primeros números primos son: " + primeNumbers);
    }


    public static boolean isPrimeNumber(Integer number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
