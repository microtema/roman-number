package de.seven.fate.handler;

import com.e2open.model.builder.annotation.Inject;
import com.e2open.model.builder.util.FieldInjectionUtil;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberHandlerTest {

    @Inject
    RomanNumberHandler sut;

    @Before
    public void setUp() {
        FieldInjectionUtil.injectFields(this);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertToRomanNumberWillThrowIllegalArgumentExceptionOnZero() {

        sut.convertToRomanNumber(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertToRomanNumberWillThrowIllegalArgumentExceptionOnLessThenZero() {

        sut.convertToRomanNumber(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertToRomanNumberWillThrowIllegalArgumentExceptionOnMax() {

        sut.convertToRomanNumber(4000);
    }

    @Test
    public void convertToRomanNumber() {

        for (int i = 1; i < 3999; i++) {
            assertTrue(StringUtils.isNotBlank(sut.convertToRomanNumber(i)));
        }
    }
}