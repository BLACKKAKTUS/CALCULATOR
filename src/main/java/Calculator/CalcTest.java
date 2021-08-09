package Calculator;

public class CalcTest {

    public static void main(String[] args) {

        ClassReadKewboard readClass = new ClassReadKewboard();
        int one;
        int two;
        System.out.print("Введите 1 число:");
        one = readClass.readKewboardInt();
        System.out.print("Введите 2 число:");
        two = readClass.readKewboardInt();

        Calc Calculator = new Calc(one, two);

        System.out.println("Выберите действие: ");
        System.out.println("1. Сложить");
        System.out.println("2. Разделить");
        System.out.println("3. Умножить");
        System.out.println("4. Разделить");
        System.out.println("0. Выйти");
        System.out.print("Выберите номер пункта: ");
        
        int action = readClass.readKewboardInt();
        
        switch (action){
            case 1 : System.out.println(Calculator.add()); break; 
            case 2 : System.out.println(Calculator.subs()); break; 
            case 3 : System.out.println(Calculator.multi()); break; 
            case 4 : System.out.println(Calculator.div()); break; 
            case 0 : break; 
            default : System.out.println("Выбран неверный пункт");;
        }
        
    }
}
