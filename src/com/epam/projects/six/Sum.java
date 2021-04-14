//8. Задан массив D. Определить следующие суммы: D [l] + D [2] + D [3]; D [3] + D [4] + D [5]; D [4] + D [5] + D [6].
//    Пояснение . Составить метод (методы) для вычисления суммы трех последовательных элементов массива с номерами от
//    k до m.
package com.epam.projects.six;

import com.epam.projects.*;

import java.util.*;

public class Sum {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numbers = new ArrayList<> ();

        InputStreamReader reader = new InputStreamReader (System.in);
        System.out.println ("Enter the length of the array");
        int len = ParseNumber.getPositiveInt (reader);
        System.out.println ("Fill the array");

        while (numbers.size () != len) {
            numbers.add (ParseNumber.getInt (reader));
        }

        sumThreeElemStepOne (numbers);
    }

    private static void sumThreeElemStepOne(ArrayList<Integer> numbers) {

        int sum;
        int a = 0;
        int b = 1;
        int c = 2;
        for (int count = 0; count < numbers.size () - 2; a++, b++, c++, count++) {
            sum = numbers.get (a) + numbers.get (b) + numbers.get (c);
            System.out.println ("The sum of the index values " + a + ", " + b + ", " + c + ": " + sum);
        }
    }
}

