package de.seven.fate.questor;

import de.seven.fate.bo.RomanNumberData;
import de.seven.fate.enums.RomanNumberType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class XComanNumberQuestorTest {

    @InjectMocks
    XCRomanNumberQuestor sut;

    @Mock
    LRomanNumberQuestor prevRomanNumberQuestor;

    RomanNumberData romanNumberData = new RomanNumberData();

    @Before
    public void setUp() {

        when(prevRomanNumberQuestor.getNumberValue()).thenReturn(RomanNumberType.L.getNumberValue());
    }

    @Test
    public void getRomanNumberType() {

        assertSame(RomanNumberType.XC, sut.getRomanNumberType());
    }

    @Test
    public void getNumberValue() {

        assertEquals(RomanNumberType.XC.getNumberValue(), sut.getNumberValue());
    }

    @Test
    public void process() {

        romanNumberData.setNumberValue(90);

        sut.process(romanNumberData);

        assertEquals(Collections.singletonList(RomanNumberType.XC), romanNumberData.getRomanNumberTypes());
    }
}