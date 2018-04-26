package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class XCRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public XCRomanNumberQuestor(LRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.XC;
    }
}
