package de.seven.fate.enums;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTypeTest {

    RomanNumberType sut;

    @Test
    public void getNumberValue() {

        assertEquals(1000, RomanNumberType.M.getNumberValue());
        assertEquals(900, RomanNumberType.CM.getNumberValue());
        assertEquals(500, RomanNumberType.D.getNumberValue());
        assertEquals(400, RomanNumberType.CD.getNumberValue());
        assertEquals(100, RomanNumberType.C.getNumberValue());
        assertEquals(90, RomanNumberType.XC.getNumberValue());
        assertEquals(50, RomanNumberType.L.getNumberValue());
        assertEquals(40, RomanNumberType.XL.getNumberValue());
        assertEquals(10, RomanNumberType.X.getNumberValue());
        assertEquals(9, RomanNumberType.IX.getNumberValue());
        assertEquals(5, RomanNumberType.V.getNumberValue());
        assertEquals(4, RomanNumberType.IV.getNumberValue());
        assertEquals(1, RomanNumberType.I.getNumberValue());
    }

    @Test
    public void ordinal() {

        assertEquals(0, RomanNumberType.M.ordinal());
        assertEquals(1, RomanNumberType.CM.ordinal());
        assertEquals(2, RomanNumberType.D.ordinal());
        assertEquals(3, RomanNumberType.CD.ordinal());
        assertEquals(4, RomanNumberType.C.ordinal());
        assertEquals(5, RomanNumberType.XC.ordinal());
        assertEquals(6, RomanNumberType.L.ordinal());
        assertEquals(7, RomanNumberType.XL.ordinal());
        assertEquals(8, RomanNumberType.X.ordinal());
        assertEquals(9, RomanNumberType.IX.ordinal());
        assertEquals(10, RomanNumberType.V.ordinal());
        assertEquals(11, RomanNumberType.IV.ordinal());
        assertEquals(12, RomanNumberType.I.ordinal());
    }
}