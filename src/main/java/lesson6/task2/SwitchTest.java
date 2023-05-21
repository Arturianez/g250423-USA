package lesson6.task2;

public class SwitchTest {
    public static void main(String[] args) {

        int value = 3;
        int b = 5;

        switch (value) { // отрабатывает та строка, значение которой совпадает, если значение равно значению value 1=1, 2=2 и тд
            case 1:
                System.out.println("Значение переменной равно 1");
                break;
            case 2:
                if ( b == 5) {
                    System.out.println("Переменная равна 5");
                }
                System.out.println("Значение перменной равно 2");
                break;
            case 5:
                System.out.println("Значение перменной равно 5");
                break;
            default:
                System.out.println("Это какое-то доугое значение");
                break;
        }

        System.out.println("Конец программы");
    }
}
