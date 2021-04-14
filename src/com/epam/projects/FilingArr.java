package com.epam.projects;

import java.util.*;

public class FilingArr {

    public static ArrayList<Integer> filingArrInt(InputStreamReader reader, int elementsArr) {

        ArrayList<Integer> arrInt = new ArrayList<> ();
        while (arrInt.size () < elementsArr) {
            arrInt.add (ParseNumber.getInt (reader));
        }
        return arrInt;
    }

    public static ArrayList<Double> filingArrDouble(InputStreamReader reader, int elementsArr) {

        ArrayList<Double> arrDouble = new ArrayList<>();
        while (arrDouble.size() < elementsArr) {
            arrDouble.add(ParseNumber.getDouble (reader));
        }
        return arrDouble;
    }

    public static ArrayList<Integer> newArrayInt() throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        int elementsArr = ParseNumber.getPositiveInt (reader);
        ArrayList<Integer> integers = filingArrInt (reader, elementsArr);
        return integers;
    }
}
