package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class IXRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public IXRomanNumberQuestor(VRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.IX;
    }
}
