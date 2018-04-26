package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class DRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public DRomanNumberQuestor(CDRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.D;
    }
}
