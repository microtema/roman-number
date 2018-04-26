package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class XRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public XRomanNumberQuestor(IXRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.X;
    }
}
