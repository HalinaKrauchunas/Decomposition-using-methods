//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол
// между сторонами длиной X и Y— прямой.

package com.epam.projects.six;

import com.epam.projects.*;

import static java.lang.Math.*;

public class AreaQuadrangle {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        int x = ParseNumber.getPositiveInt (reader);
        int y = ParseNumber.getPositiveInt (reader);
        int z = ParseNumber.getPositiveInt (reader);
        int t = ParseNumber.getPositiveInt (reader);

        double diagonal = getDiagonal (x, y);
        double areaTriangleOne = x * y * 0.5;
        double areaQuadrangle = areaTriangleOne + getAreaTriangleTwo (z, t, diagonal);
        System.out.println (areaQuadrangle);
    }

    private static double getAreaTriangleTwo(int z, int t, double diagonal) {

        return 0.25 * sqrt ((diagonal + z + t) * (diagonal + z - t) * (diagonal + t - z) * (z + t - diagonal));
    }

    private static double getDiagonal(int x, int y) {

        return sqrt (x * x + y * y);
    }
}

