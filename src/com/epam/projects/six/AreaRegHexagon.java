//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

package com.epam.projects.six;

import com.epam.projects.*;

public class AreaRegHexagon {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        int side = ParseNumber.getPositiveInt (reader);
        double areaHexagon = 6 * AreaRegHexagon.getAreaTriangle (side);
        System.out.println (areaHexagon);
    }

    private static double getAreaTriangle(int side) {

        return (side * side * Math.sqrt (3)) / 4;
    }
}
