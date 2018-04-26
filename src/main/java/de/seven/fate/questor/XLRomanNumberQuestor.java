package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class XLRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public XLRomanNumberQuestor(XRomanNumberQuestor nextRomanNumberQuestor) {
        super(nextRomanNumberQuestor);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.XL;
    }
}
