package com.violence.lcdDigits;

/**
 * created by user violence
 * created on 07.03.2019
 * class created for project lcdDigits
 */


public class Util {
    public static void outDigits(String[] number) {
        for (int i = 0; i < number.length; i++) {
            Digit digit = DigitFactory.getDigit(Integer.valueOf(number[i]));
            outTop(digit);
        }
        System.out.println();
        for (int i = 0; i < number.length; i++) {
            Digit digit = DigitFactory.getDigit(Integer.valueOf(number[i]));
            outCenter(digit);
        }
        System.out.println();
        for (int i = 0; i < number.length; i++) {
            Digit digit = DigitFactory.getDigit(Integer.valueOf(number[i]));
            outBottom(digit);
        }
    }

    private static void outTop(Digit digit) {
        System.out.print(digit.getTop() + "   ");
    }

    private static void outCenter(Digit digit) {
        System.out.print(digit.getLeftTop() + digit.getCenter() + digit.getRightTop() + "   ");
    }

    private static void outBottom(Digit digit) {
        System.out.print(digit.getLeftBottom() + digit.getBottom() + digit.getRightBottom() + "   ");
    }
}
