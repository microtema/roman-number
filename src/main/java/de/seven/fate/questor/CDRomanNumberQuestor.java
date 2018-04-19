package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class CDRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public CDRomanNumberQuestor(CRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.CD;
    }
}
