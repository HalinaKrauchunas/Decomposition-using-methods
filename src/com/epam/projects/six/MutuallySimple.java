//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

package com.epam.projects.six;

import com.epam.projects.*;

import static com.epam.projects.six.NodAndNok.*;

public class MutuallySimple {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        int a = ParseNumber.getPositiveInt (reader);
        int b = ParseNumber.getPositiveInt (reader);
        int c = ParseNumber.getPositiveInt (reader);

        if (getNod (a, b) == getNod (a, c) && getNod (a, b) == 1) {
            System.out.println ("Numbers " + a + ", " + b + ", " + c + " mutually simple.");
        } else {
            System.out.println ("Numbers " + a + ", " + b + ", " + c + "  are not coprime.");
        }
    }
}