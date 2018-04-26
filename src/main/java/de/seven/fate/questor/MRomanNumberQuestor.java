package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class MRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public MRomanNumberQuestor(CMRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.M;
    }

}
