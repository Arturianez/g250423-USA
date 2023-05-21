package homeworks.lesson5;

import java.util.Random;

public class HardTask {
    public static void main(String[] args) {
        Random random = new Random();
        int sec = random.nextInt(28800) + 0; // sec написал для удобства
        System.out.println("Число на табло в секундах: " + sec); // для тех кто понимает в сек
        int hrs = sec / 3600;
        System.out.println("Число на табло в часах: " + hrs); // для тех кто понимает в часах и не понимает в секундах
        int start = 9;
        int finish = 17;
        int rem = finish - start - hrs;

        if (rem >= 5) { // Остаточное время в понятных фразах дял всех
            System.out.println("Осталось " + rem + " часов");
        } else if (rem >= 2 && rem <=4) {
            System.out.println("Осталось " + rem + " часа");
        } else if (rem == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        } // Напишите пожалуйста почему бывают неровные значения: 28683 сек, 1 час , Остался 1 час.
          // Потому что без форматирования чисел?
    }
}






