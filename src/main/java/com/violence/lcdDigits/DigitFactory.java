package com.violence.lcdDigits;

/**
 * created by user violence
 * created on 07.03.2019
 * class created for project lcdDigits
 */


public class DigitFactory {
    public static Digit getDigit(Integer digit) {
        switch (digit) {
            case 0:
                return Digit.newBuilder()
                        .setTop("*-*")
                        .setCenter("*")
                        .setBottom("_")
                        .setLeftTop("|")
                        .setLeftBottom("|")
                        .setRightTop("|")
                        .setRightBottom("|")
                        .build();
            case 1:
                return Digit.newBuilder()
                        .setTop("***")
                        .setCenter("*")
                        .setBottom("*")
                        .setLeftTop("*")
                        .setLeftBottom("*")
                        .setRightTop("|")
                        .setRightBottom("|")
                        .build();
            case 2:
                return Digit.newBuilder()
                        .setTop("*-*")
                        .setCenter("_")
                        .setBottom("_")
                        .setLeftTop("*")
                        .setLeftBottom("|")
                        .setRightTop("|")
                        .setRightBottom("*")
                        .build();
            case 3:
                return Digit.newBuilder()
                        .setTop("*-*")
                        .setCenter("_")
                        .setBottom("_")
                        .setLeftTop("*")
                        .setLeftBottom("*")
                        .setRightTop("|")
                        .setRightBottom("|")
                        .build();
            case 4:
                return Digit.newBuilder()
                        .setTop("***")
                        .setCenter("_")
                        .setBottom("*")
                        .setLeftTop("|")
                        .setLeftBottom("*")
                        .setRightTop("|")
                        .setRightBottom("|")
                        .build();
            case 5:
                return Digit.newBuilder()
                        .setTop("*-*")
                        .setCenter("_")
                        .setBottom("_")
                        .setLeftTop("|")
                        .setLeftBottom("*")
                        .setRightTop("*")
                        .setRightBottom("|")
                        .build();
            case 6:
                return Digit.newBuilder()
                        .setTop("*-*")
                        .setCenter("_")
                        .setBottom("_")
                        .setLeftTop("|")
                        .setLeftBottom("|")
                        .setRightTop("*")
                        .setRightBottom("|")
                        .build();
            case 7:
                return Digit.newBuilder()
                        .setTop("*-*")
                        .setCenter("*")
                        .setBottom("*")
                        .setLeftTop("*")
                        .setLeftBottom("*")
                        .setRightTop("|")
                        .setRightBottom("|")
                        .build();
            case 8:
                return Digit.newBuilder()
                        .setTop("*-*")
                        .setCenter("_")
                        .setBottom("_")
                        .setLeftTop("|")
                        .setLeftBottom("|")
                        .setRightTop("|")
                        .setRightBottom("|")
                        .build();
            case 9:
                return Digit.newBuilder()
                        .setTop("*-*")
                        .setCenter("_")
                        .setBottom("*")
                        .setLeftTop("|")
                        .setLeftBottom("*")
                        .setRightTop("|")
                        .setRightBottom("|")
                        .build();
        }
        return null;
    }
}
