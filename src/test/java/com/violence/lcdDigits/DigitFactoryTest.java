package com.violence.lcdDigits;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by user violence
 * created on 07.03.2019
 * class created for project lcdDigits
 */

public class DigitFactoryTest {
    private Digit digit;

    /**
     * digit 4
     **/
    @Before
    public void init() {
        digit = Digit.newBuilder()
                .setTop("***")
                .setCenter("_")
                .setBottom("*")
                .setLeftTop("|")
                .setLeftBottom("*")
                .setRightTop("|")
                .setRightBottom("|")
                .build();
    }

    @Test
    public void shouldReturnLCDDigit() {
        assertNotNull(DigitFactory.getDigit(2));
    }

    @Test
    public void shouldReturnDigitEqualsInitDigit() {
        assertEquals(digit, DigitFactory.getDigit(4));
    }

    @Test
    public void shouldReturnDigitNotEqualsInitDigit() {
        assertNotEquals(digit, DigitFactory.getDigit(8));
    }

    @Test
    public void hashCodeMustBeEquals() {
        assertEquals(digit.hashCode(), DigitFactory.getDigit(4).hashCode());
    }

    @Test(timeout = 15)
    public void shouldBeFastThen() {
        Util.outDigits(new String[] {"0", "5", "7", "1", "6"});
    }
}