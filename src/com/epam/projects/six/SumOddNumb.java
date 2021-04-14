//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
// сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

package com.epam.projects.six;

import com.epam.projects.*;

import java.util.*;

public class SumOddNumb {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        System.out.println ("Enter the number rank: ");
        int rank = ParseNumber.getPositiveInt (reader);
        int min = getMin (rank);
        int max = getMax (rank);

        System.out.println ("Enter the number of generated digits: ");
        int countNumber = ParseNumber.getPositiveInt (reader);

        ArrayList<Integer> oddNumbers = new ArrayList<> ();
        fillingArrOdd (max, min, countNumber, oddNumbers);

        System.out.println ("Generated array of odd numbers from " + countNumber + " elements: " + oddNumbers);
        System.out.println ("Sum of array elements: " + getSumOddNumb (oddNumbers));
        System.out.println ("The number of even digits in the sum: " + getEvenNumb (oddNumbers));
    }

    private static int getMax(int rank) {

        String numbMax = "9";
        while (rank != 1) {
            numbMax += "9";
            rank--;
        }
        int max = Integer.parseInt (numbMax);
        return max;
    }

    private static int getMin(int rank) {

        String numbMin = "1";
        while (rank != 1) {
            numbMin += "0";
            rank--;
        }
        int min = Integer.parseInt (numbMin);
        return min;
    }

    private static int getEvenNumb(ArrayList<Integer> oddNumbers) {

        String number = String.valueOf (getSumOddNumb (oddNumbers));
        int evenNumb = 0;
        for (int i = 0; i < number.length (); i++) {
            if (Integer.parseInt (number.substring (i, i + 1)) % 2 == 0) {
                evenNumb++;
            }
        }
        return evenNumb;
    }

    private static int getSumOddNumb(ArrayList<Integer> oddNumbers) {

        int sum = 0;
        for (int i : oddNumbers) {
            sum += i;
        }
        return sum;
    }

    private static void fillingArrOdd(int max, int min, int countNumber, ArrayList<Integer> oddNumbers) {

        while (oddNumbers.size () != countNumber) {
            max -= min;
            int numb = (int) (Math.random () * ++max) + min;
            if (numb % 2 != 0) {
                oddNumbers.add (numb);
            }
        }
    }
}