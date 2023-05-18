package homeworks.lesson4;

import java.util.Scanner;

public class HMScanner {
    public static void main(String[] args) {

        System.out.println("Введите 2 слова с четным кол-вом букв:");
        Scanner scanner = new Scanner(System.in);
        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();
        System.out.println("Вы ввели слово: "+ p1 + " " + p2);

        int half1 = p1.length() /2;
        int half2 = p2.length() /2;
        String result = p1.substring(0,half1) + p2.substring(half2);
        System.out.println(result);

    }
}
