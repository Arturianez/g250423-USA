package homeworks.lesson5;

public class Flasks {
    public static void main(String[] args) {
        int temperature1 = 134;
        int temperature2 = 76;
        int result = totalTemp(temperature1,temperature2);

        if (result > 0 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
    public static int totalTemp(int temperature1, int temperature2) {
        if (temperature1 >= 100 && temperature2 <= 100) {
            return 1;
        } else {
            return 0;
        }
    }
}
