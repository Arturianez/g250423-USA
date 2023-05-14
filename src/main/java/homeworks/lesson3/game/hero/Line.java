package homeworks.lesson3.game.hero;

public class Line {
    public static void main(String[] args) {
        String line = new String(" I study Basic Java! ");
        System.out.println(line);

        System.out.println(line.charAt(19));

        System.out.println("Содержание подстроки Java: " + line.contains("Java") );

        System.out.println("Заменяем символы 'а' на 'о': " + line.replace('a','o'));

        System.out.println("Преобразование строки в верхний регистр: " + line.toUpperCase());
        System.out.println("Преобразование строки в нижний регистр: " + line.toLowerCase());

        System.out.println("Вырезание строки Java: " + line.substring(15,19));
    }
}
