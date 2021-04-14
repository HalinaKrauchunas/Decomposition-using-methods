package com.epam.projects;

import static java.lang.Math.*;

public class MethodsForFunctions {

    public static Double resultFunctionFirst(Double number1, Double number2, Double number3) {

        Double resultFunction = ((number1 - 3) * number2 / 2) + number3;
        return resultFunction;
    }

    public static Double resultFunctionSecond(Double number1, Double number2, Double number3) {

        Double resultFunction =
            number2 + (sqrt(pow(number2, 2)) + 4 * number1 * number3 / (2 * number1)) - pow(number1, 3) * number3 + pow(number2, -2);
        return resultFunction;
    }

    public static Double resultFunctionThird(Double number1, Double number2) {

        Double resultFunction = sin(number1) + cos(number2) / (cos(number1) - sin(number2)) * tan(number1 * number2);
        return resultFunction;
    }

    public static double findAreaTriangleByCoordinates(
        double x1, double y1, double x2, double y2, double x3,
        double y3
    ) {

        double areaTriangle = Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
        return areaTriangle;
    }
    public static Boolean belongPointArea(
        double pointX,
        double pointY,
        double maxX,
        double maxY,
        double minX,
        double minY
    ) {

        return pointX >= minX && pointX <= maxX && pointY >= minY && pointY <= maxY;
    }
}


