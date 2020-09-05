package com.nothingistrue;

public class Hello {
    public static void sayHello() throws Exception {
        System.out.println("\nHello, World!");
        int myFirstInt = 5;
        // Generally String appending is not efficient
        // Because Strings are immutable, so a new String is actually created.
        // Usually people use SringBuffer to change a string.
        System.out.println("My First int: " + myFirstInt);
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Largest int: " + maxInt);
        System.out.println("Smallest int: " + minInt);
        boolean t = true;
        System.out.println("Variable t is " + t);
        boolean f = false;
        System.out.println("Variable f is " + f);

        long maxLong = Long.MAX_VALUE;
        long myLong = 1000L;
        long minLong = Long.MIN_VALUE;
        System.out.println("Long value: " + myLong);
        System.out.println("Max Long value is " + maxLong + " and min Long value is " + minLong);

        // Demonstrate unicode string printing
        String copyright = "Written by DQ \u00A9 2020 \n";
        System.out.println(copyright);

    }
}
