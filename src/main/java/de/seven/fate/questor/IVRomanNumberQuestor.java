package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class IVRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public IVRomanNumberQuestor(IRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.IV;
    }
}
