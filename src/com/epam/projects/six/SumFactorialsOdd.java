//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

package com.epam.projects.six;

import com.epam.projects.*;

public class SumFactorialsOdd {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        System.out.println ("Please enter a positive odd number");
        int interval = ParseNumber.pozitiveOddNumb (reader);
        System.out.println ("The sum of the factorials of all odd numbers from 1 to " + interval + ": " + getSumFactorialOddNumber (interval));
    }

    private static int getSumFactorialOddNumber(int interval) {

        int factorial = 1;
        int sumFactorial = 0;
        for (int enumeration = 1; enumeration <= interval; enumeration++) {
            if (enumeration % 2 != 0) {
                for (int count = 1; count <= enumeration; count++) {
                    factorial *= count;
                }
                sumFactorial += factorial;
                System.out.println ("Fact " + enumeration + ": " + factorial);
                factorial = 1;
            }
        }
        return sumFactorial;
    }
}
