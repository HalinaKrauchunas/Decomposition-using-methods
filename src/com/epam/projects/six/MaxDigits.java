//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

package com.epam.projects.six;

import com.epam.projects.*;

import static java.lang.Math.*;

public class MaxDigits {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader (System.in);
        Integer numberA = abs (ParseNumber.getInt (reader));
        Integer numberB = abs (ParseNumber.getInt (reader));
        getLongestNumb (numberA, numberB);
    }

    private static void getLongestNumb(Integer numberA, Integer numberB) {

        if (numberA.toString ().length () == numberB.toString ().length ()) {
            System.out.println ("The number of digits is the same\n");
        } else {
            System.out.println (max (numberA, numberB));
        }
    }
}