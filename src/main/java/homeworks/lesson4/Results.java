package homeworks.lesson4;

public class Results {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int addResult = add(a,b);
        int subResult = sub(a,b);
        int mulResult = mul(a,b);
        double divResult = div(a,b);

        System.out.println("Сложение а и b: " + addResult);
        System.out.println("Вычитание а и b: " + subResult);
        System.out.println("Умножение a и b: " + mulResult);
        System.out.println("Деление a и b: " + divResult);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return  result;
    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public  static  int mul(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) {
        double result = a / b;
        return result;
    }

}
