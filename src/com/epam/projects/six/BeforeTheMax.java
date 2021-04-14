//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое
// меньше максимального элемента массива, но больше всех других элементов).

package com.epam.projects.six;

import com.epam.projects.*;

import java.util.*;

public class BeforeTheMax {

    public static void main(String[] args) throws Exception {

        System.out.println ("Enter the size of the array");
        InputStreamReader reader = new InputStreamReader (System.in);
        int size = ParseNumber.getPositiveInt (reader);

        ArrayList<Integer> arrays = new ArrayList<> ();
        while (size > 0) {
            arrays.add ((int) (Math.random () * 100));
            size--;
        }
        System.out.println (arrays);
        getBeforeTheMax (arrays);
    }

    private static void getBeforeTheMax(ArrayList<Integer> arrays) {

        arrays.sort (Integer::compareTo);
        System.out.println (arrays.get (arrays.size () - 2));
    }
}
