package Calculator;

import java.util.Scanner;

public class ClassReadKewboard {

    public int readKewboardInt() {
        Scanner s = new Scanner(System.in);
        int a = 0;
        if (s.hasNextInt()) {
            a = s.nextInt();

        } else {
            System.out.println("Введено не целове число: ");
        }
        return a;

    }

}
