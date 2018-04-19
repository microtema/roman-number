package de.seven.fate.handler;

import de.seven.fate.bo.RomanNumberData;
import de.seven.fate.enums.RomanNumberType;
import de.seven.fate.questor.MRomanNumberQuestor;
import de.seven.fate.questor.RomanNumberQuestor;
import org.apache.commons.lang3.Validate;

import java.util.List;
import java.util.stream.Collectors;

public class RomanNumberHandler {

    private final RomanNumberQuestor romanNumberQuestor;

    public RomanNumberHandler(MRomanNumberQuestor romanNumberQuestor) {
        this.romanNumberQuestor = romanNumberQuestor;
    }

    public String convertToRomanNumber(int number) {
        Validate.isTrue(number > 0, "Number %d must be greater then zero", number);
        Validate.isTrue(number < 4000, "Number %d must be less then 4000", number);

        RomanNumberData romanNumberData = new RomanNumberData();

        romanNumberData.setNumberValue(number);

        romanNumberQuestor.process(romanNumberData);

        List<RomanNumberType> romanNumberTypes = romanNumberData.getRomanNumberTypes();

        return romanNumberTypes.stream().map(RomanNumberType::name).collect(Collectors.joining());
    }
}
