package homeworks.lesson4;

public class Pizza {
    public static void main(String[] args) {

        int p = 24;
        int bp = 28;
        double result = Math.pow(p,2);
        double result1 = Math.pow(bp,2);
        double s24 = 40*(3.14*(result/4));
        double s28 = 40*(3.14*(result1/4));
        double total = s28 - s24;

        String formattedDouble1 = String.format("%.2f", s28);
        String formattedDouble2 = String.format("%.2f", total);

        System.out.println("Пицца диаметром 24 см содержит: " + s24 + " каллорий");
        System.out.println("Пицца диаметром 28 см содержит: " + formattedDouble1 + " каллорий");
        System.out.println("Если купить пиццу 28 см, то доп.каллорий будет: "+ formattedDouble2 + " каллорий");
    }
}
