package lesson6.task4;

public class TernaryTest {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int max;

        // в переменную max нужно записать максимальное значение из переменных а и b

        //  if (a>b) {
        // max = a;
        //  } else {
        //    max = b;
        // }

        // Пример тернарного оператора
        max = a > b ? a : b; // результатом будет true or false, если false то b(при а 5 и b 10)

        System.out.println("Максимальное число: " + max);


    }
}
