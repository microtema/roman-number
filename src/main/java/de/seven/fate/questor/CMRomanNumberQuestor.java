package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class CMRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public CMRomanNumberQuestor(DRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.CM;
    }
}
