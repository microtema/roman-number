package de.seven.fate.enums;

public enum RomanNumberType {

    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);

    private final int numberValue;

    RomanNumberType(int numberValue) {
        this.numberValue = numberValue;
    }

    public int getNumberValue() {
        return numberValue;
    }
}
