package com.violence.lcdDigits;

import java.util.Scanner;

/**
 * created by user violence
 * created on 07.03.2019
 * class created for project lcdDigits
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.nextLine().split("");
        Util.outDigits(number);
    }
}
