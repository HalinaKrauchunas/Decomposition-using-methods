//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

package com.epam.projects.six;

import com.epam.projects.*;

import static com.epam.projects.six.NodAndNok.*;

public class NodFourNumbers {

    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader (System.in);
        int a = Math.abs (ParseNumber.getInt (reader));
        int b = Math.abs (ParseNumber.getInt (reader));
        int c = Math.abs (ParseNumber.getInt (reader));
        int d = Math.abs (ParseNumber.getInt (reader));

        getFourNod (a, b, c, d);
    }

    private static void getFourNod(int a, int b, int c, int d) {

        int oneNod = getNod (c, d);
        int twoNod = getNod (a, b);
        System.out.println (getNod (oneNod, twoNod));
    }
}
