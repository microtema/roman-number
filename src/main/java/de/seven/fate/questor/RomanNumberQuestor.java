package de.seven.fate.questor;

import de.seven.fate.bo.RomanNumberData;
import de.seven.fate.enums.RomanNumberType;

/**
 * Responsibility of Chain interface
 */
public interface RomanNumberQuestor {

    /**
     * Process given romanNumberData
     *
     * @param romanNumberData may not be null;
     */
    void process(RomanNumberData romanNumberData);

    /**
     * @return RomanNumberType for this implementation
     */
    RomanNumberType getRomanNumberType();

    default int getNumberValue() {

        return getRomanNumberType().getNumberValue();
    }
}
