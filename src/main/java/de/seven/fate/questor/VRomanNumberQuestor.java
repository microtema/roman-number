package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class VRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public VRomanNumberQuestor(IVRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.V;
    }
}
