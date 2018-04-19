package de.seven.fate.questor;

import de.seven.fate.bo.RomanNumberData;
import de.seven.fate.enums.RomanNumberType;
import org.apache.commons.lang3.Validate;

import java.util.List;

public abstract class AbstractRomanNumberQuestor implements RomanNumberQuestor {

    private final RomanNumberQuestor nextQuestor;

    public AbstractRomanNumberQuestor(RomanNumberQuestor nextQuestor) {
        this.nextQuestor = nextQuestor;
    }

    @Override
    public void process(RomanNumberData romanNumberData) {
        Validate.notNull(romanNumberData);

        int numberValue = romanNumberData.getNumberValue();

        if (numberValue == 0) {

            return;
        }

        List<RomanNumberType> romanNumberTypes = romanNumberData.getRomanNumberTypes();

        if (numberValue >= getNumberValue()) {

            romanNumberTypes.add(getRomanNumberType());
            romanNumberData.setNumberValue(numberValue - getNumberValue());

            process(romanNumberData);

        } else if (numberValue < getNumberValue()) {

            nextQuestor.process(romanNumberData);
        }
    }
}
