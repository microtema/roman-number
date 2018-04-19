package de.seven.fate.bo;

import de.seven.fate.enums.RomanNumberType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RomanNumberData {

    private int numberValue;

    private final List<RomanNumberType> romanNumberTypes = new ArrayList<>();
}
