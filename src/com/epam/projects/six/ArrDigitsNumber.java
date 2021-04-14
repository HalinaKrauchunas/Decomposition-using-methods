//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры
// числа N.

package com.epam.projects.six;

import com.epam.projects.*;

import java.util.*;

public class ArrDigitsNumber {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        String n = String.valueOf (ParseNumber.getPositiveInt (reader));
        System.out.println (getDigits (n));
    }

    private static String getDigits(String n) {

        return Arrays.toString (n.toCharArray ());
    }
}