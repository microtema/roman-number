package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class LRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public LRomanNumberQuestor(XLRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.L;
    }
}
