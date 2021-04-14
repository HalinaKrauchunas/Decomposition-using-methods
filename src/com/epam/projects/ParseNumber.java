package com.epam.projects;

public class ParseNumber {

    public static Double getDouble(InputStreamReader reader) {

        String inputString = reader.readLine ();
        try {
            return Double.parseDouble (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! You entered not a number. This variable will be assigned the default value \"1" +
                ".0\"");
            return 1.0;
        }
    }

    public static long getLong(InputStreamReader reader) {

        String inputString = reader.readLine ();
        try {
            return Long.parseLong (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! This variable will be assigned the default value 1");
            return 1;
        }
    }

    public static int getPositiveInt(InputStreamReader reader) throws Exception {

        String inputString = reader.readLine ();
        try {
            if (Integer.parseInt (inputString) < 0) throw new Exception ("You entered a negative number");
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! This variable will be assigned the default value 1");
            return 1;
        }
    }

    public static int multipleOfFour(InputStreamReader reader) throws Exception {

        String inputString = reader.readLine ();
        try {
            if (Integer.parseInt (inputString) % 4 < 0)
                throw new Exception ("You entered a number that is not a multiple of 4");
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! This variable will be assigned the default value 4");
            return 4;
        }
    }

    public static int getInt(InputStreamReader reader) {

        String inputString = reader.readLine ();
        try {
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! This variable will be assigned the default value 1");
            return 1;
        }
    }

    public static int pozitiveOddNumb(InputStreamReader reader) throws Exception {

        String inputString = reader.readLine ();
        try {
            if (Integer.parseInt (inputString) % 2 == 0 || Integer.parseInt (inputString)<1) throw new Exception (
                "You entered the wrong number");
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! This variable will be assigned the default value 4");
            return 1;
        }
    }
}

