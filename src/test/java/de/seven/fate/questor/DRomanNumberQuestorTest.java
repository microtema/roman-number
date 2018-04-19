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
public class DRomanNumberQuestorTest {

    @InjectMocks
    DRomanNumberQuestor sut;

    @Mock
    CDRomanNumberQuestor prevRomanNumberQuestor;

    RomanNumberData romanNumberData = new RomanNumberData();

    @Before
    public void setUp() {

        when(prevRomanNumberQuestor.getNumberValue()).thenReturn(RomanNumberType.CD.getNumberValue());
    }

    @Test
    public void getRomanNumberType() {

        assertSame(RomanNumberType.D, sut.getRomanNumberType());
    }

    @Test
    public void getNumberValue() {

        assertEquals(RomanNumberType.D.getNumberValue(), sut.getNumberValue());
    }

    @Test
    public void process() {

        romanNumberData.setNumberValue(500);

        sut.process(romanNumberData);

        assertEquals(Collections.singletonList(RomanNumberType.D), romanNumberData.getRomanNumberTypes());
    }
}