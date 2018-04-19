package de.seven.fate.questor;

import de.seven.fate.enums.RomanNumberType;

public class IRomanNumberQuestor extends AbstractRomanNumberQuestor {

    public IRomanNumberQuestor() {
        super(null);
    }

    @Override
    public RomanNumberType getRomanNumberType() {
        return RomanNumberType.I;
    }
}
