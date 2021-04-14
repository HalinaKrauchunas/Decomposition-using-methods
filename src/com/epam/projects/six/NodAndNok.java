//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных
// чисел:

package com.epam.projects.six;

public class NodAndNok {

    public static void main(String[] args) {

        int a = 8;
        int b = 4;
        System.out.println (getNod (a, b));
        System.out.println (getNok (a, b));
    }

    static int getNod(int a, int b) {

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    private static int getNok(int a, int b) {

        return a * b / getNod (a, b);
    }
}