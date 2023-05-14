package lesson4.task3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {
    public static void main(String[] args) {
        System.out.println("Первый способ"); // самим указывать нельзя!
        System.out.println(Math.random()); // от 0 до 1
        System.out.println((int) (Math.random() * 10)); // от 0 до 9
        System.out.println((int) (Math.random() * 10) +10); // от 10 до 20

        System.out.println("Второй способ"); // большие целые или указываем сами
        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(20));
        System.out.println(random.nextInt(30));
        System.out.println(random.nextInt(40));
        System.out.println(random.nextInt(50));

        System.out.println("Третий способ"); // можем указать целые или диапозон
        System.out.println(ThreadLocalRandom.current().nextInt(10));
        System.out.println(ThreadLocalRandom.current().nextInt(20));
        System.out.println(ThreadLocalRandom.current().nextInt(30, 40));
        System.out.println(ThreadLocalRandom.current().nextInt(50));
        System.out.println(ThreadLocalRandom.current().nextInt(60));


    }
}
