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
public class LComanNumberQuestorTest {

    @InjectMocks
    LRomanNumberQuestor sut;

    @Mock
    XLRomanNumberQuestor prevRomanNumberQuestor;

    RomanNumberData romanNumberData = new RomanNumberData();

    @Before
    public void setUp() {

        when(prevRomanNumberQuestor.getNumberValue()).thenReturn(RomanNumberType.XL.getNumberValue());
    }

    @Test
    public void getRomanNumberType() {

        assertSame(RomanNumberType.L, sut.getRomanNumberType());
    }

    @Test
    public void getNumberValue() {

        assertEquals(RomanNumberType.L.getNumberValue(), sut.getNumberValue());
    }

    @Test
    public void process() {

        romanNumberData.setNumberValue(50);

        sut.process(romanNumberData);

        assertEquals(Collections.singletonList(RomanNumberType.L), romanNumberData.getRomanNumberTypes());
    }
}