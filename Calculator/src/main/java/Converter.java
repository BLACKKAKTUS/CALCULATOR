import java.util.List;

class Converter {

    public static int toRom(String v) {
        int n1 = 0;
        if (v.equals("I")) {
            n1 = 1;
        }
        if (v.equals("II")) {
            n1 = 2;
        }
        if (v.equals("III")) {
            n1 = 3;
        }
        if (v.equals("IV")) {
            n1 = 4;
        }
        if (v.equals("V")) {
            n1 = 5;
        }
        if (v.equals("VI")) {
            n1 = 6;
        }
        if (v.equals("VII")) {
            n1 = 7;
        }
        if (v.equals("VIII")) {
            n1 = 8;
        }
        if (v.equals("IX")) {
            n1 = 9;
        }
        if (v.equals("X")) {
            n1 = 10;
        }
        return n1;

    }

    public static int toArab(String v) {
        int n2 = 0;
        if (v.equals("1")) {
            n2 = 1;
        }
        if (v.equals("2")) {
            n2 = 2;
        }
        if (v.equals("3")) {
            n2 = 3;
        }
        if (v.equals("4")) {
            n2 = 4;
        }
        if (v.equals("5")) {
            n2 = 5;
        }
        if (v.equals("6")) {
            n2 = 6;
        }
        if (v.equals("7")) {
            n2 = 7;
        }
        if (v.equals("8")) {
            n2 = 8;
        }
        if (v.equals("9")) {
            n2 = 9;
        }
        if (v.equals("10")) {
            n2 = 10;
        }
        return n2;

    }

    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<NUMERAL> romanNumerals = NUMERAL.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            NUMERAL currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}