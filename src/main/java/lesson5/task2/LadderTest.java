package lesson5.task2;

public class LadderTest {
    public static void main(String[] args) {

        int a = 21;
        int b = 20;

        if (a < b ) {
            System.out.println("А меньше, чем В");
        } else if (a > b) {
            System.out.println("А больше, чем В");
        } else {
            System.out.println("А равно В");
        }
        if (!(a < b)) {
            System.out.println("А не меньше чем В");
        }
    }
}
