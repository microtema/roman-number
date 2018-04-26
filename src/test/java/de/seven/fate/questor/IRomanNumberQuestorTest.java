package de.seven.fate.questor;

import de.seven.fate.bo.RomanNumberData;
import de.seven.fate.enums.RomanNumberType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class IRomanNumberQuestorTest {

    @InjectMocks
    IRomanNumberQuestor sut;

    @Mock
    IVRomanNumberQuestor prevRomanNumberQuestor;

    RomanNumberData romanNumberData = new RomanNumberData();

    @Before
    public void setUp() {

        when(prevRomanNumberQuestor.getNumberValue()).thenReturn(RomanNumberType.IV.getNumberValue());
    }

    @Test
    public void getRomanNumberType() {

        assertEquals(RomanNumberType.I, sut.getRomanNumberType());
    }

    @Test
    public void getNumberValue() {

        assertEquals(RomanNumberType.I.getNumberValue(), sut.getNumberValue());
    }

    @Test
    public void process() {

        romanNumberData.setNumberValue(1);

        sut.process(romanNumberData);

        assertEquals(Collections.singletonList(RomanNumberType.I), romanNumberData.getRomanNumberTypes());
    }

    @Test
    public void process_2() {

        romanNumberData.setNumberValue(2);

        sut.process(romanNumberData);

        assertEquals(Arrays.asList(RomanNumberType.I, RomanNumberType.I), romanNumberData.getRomanNumberTypes());
    }

    @Test
    public void process_3() {

        romanNumberData.setNumberValue(3);

        sut.process(romanNumberData);

        assertEquals(Arrays.asList(RomanNumberType.I, RomanNumberType.I, RomanNumberType.I), romanNumberData.getRomanNumberTypes());
    }
}