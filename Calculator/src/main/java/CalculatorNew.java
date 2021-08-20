import java.util.*;


public class CalculatorNew {

    public static void main(String[] args) {


        startCalc();
        Converter Converter = new Converter();
        String a;
        String b;
        String c;
        int num1 = 0;
        int num2 = 0;
        int arabic = 0;
        int roman = 0;


        String[] arab = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
        };
        String[] rom = {
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
        };

        

        while (true) {
            Scanner vvod = new Scanner(System.in);

            a = vvod.next();

            if (a.equals("exit")) {
                System.out.println("До скорых встреч");
                break;
            }

            for (int i = 0; i < 10; i++) {
                if (a.equals(arab[i])) {
                    num1 = Converter.toArab(a);
                    arabic++;

                } else if (a.equals(rom[i])) {
                    num1 = Converter.toRom(a);
                    roman++;

                }

            }
            c = vvod.next();

            b = vvod.next();
            for (int i = 0; i < 10; i++) {
                if (b.equals(arab[i])) {
                    num2 = Converter.toArab(b);
                    arabic++;

                } else if (b.equals(rom[i])) {
                    num2 = Converter.toRom(b);
                    roman++;

                }

            }

            if (c.equals("+") && arabic == 2) {
                System.out.println(num1 + num2);
            } else if (c.equals("+") && roman == 2) {
                System.out.println(Converter.arabicToRoman(num1 + num2));
            } else if (c.equals("-") && arabic == 2) {
                System.out.println(num1 - num2);
            } else if (c.equals("-") && roman == 2) {
                System.out.println(Converter.arabicToRoman(num1 - num2));
            } else if (c.equals("*") && arabic == 2) {
                System.out.println(num1 * num2);
            } else if (c.equals("*") && roman == 2) {
                System.out.println(Converter.arabicToRoman(num1 * num2));
            } else if (c.equals("/") && arabic == 2) {
                System.out.println(num1 / num2);
            } else if (c.equals("/") && roman == 2) {
                System.out.println(Converter.arabicToRoman(num1 / num2));
            } else {
                throw new IllegalArgumentException("Ты что-то делаешь не верно");

            }
            arabic = 0;
            roman = 0;
            System.out.println("Попробуй решить еще, либо выйди из программы набрав exit");
        }
    }

    private static void startCalc() {
        System.out.println("Добро пожаловать в программу Калькулятор");
        System.out.println("Калькулятор работает с Арабскими и Римскими цифрами");
        System.out.println("Для ввода данных используйте формат: I + X либо 1 + 10");
        System.out.println("Для выхода из программы наберите exit");
    }


}






