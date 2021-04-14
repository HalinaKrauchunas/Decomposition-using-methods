//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
// надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

package com.epam.projects.six;

import com.epam.projects.*;

public class SubtractingSumDigits {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader (System.in);
        int count = 0;
        int number = ParseNumber.getInt (reader);
        System.out.println (getCount (count, number));
    }

    private static int getCount(int count, int number) {

        while (number != 0) {
            int len = String.valueOf (number).length ();
            number -= len;
            count++;
        }
        return count;
    }
}
