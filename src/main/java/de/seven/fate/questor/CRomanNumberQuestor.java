package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class CRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public CRomanNumberQuestor(XCRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.C;
    }
}
