package homeworks.lesson4;

public class Converter {
    public static void main(String[] args) {

        int eu = 1000;
        double usaResult = usa(eu);
        System.out.println("Евро в долларах на 05.17.23 составляет: " + usaResult);

    }

    public static double usa(double eu) {
        double result = eu * 1.08;
        return result;
    }
}
