package de.seven.fate.client;

import com.e2open.commons.utils.ClassUtil;
import de.seven.fate.handler.RomanNumberHandler;

public class RomanNumberClient {

    private static final RomanNumberHandler romanNumberHandler = ClassUtil.createInstance(RomanNumberHandler.class);

    public static void main(String[] args) {

        int start = args.length > 1 ? Integer.valueOf(args[0]) : 1;
        int end = args.length > 2 ? Integer.valueOf(args[1]) : 1;

        for (int number = start; number < end; number++) {

            String romanNumber = romanNumberHandler.convertToRomanNumber(number);

            System.out.println(String.format("Convert number: %d to Roman: %s", number, romanNumber));
        }
    }
}
