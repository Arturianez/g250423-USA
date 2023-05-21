package homeworks.lesson5;

public class Walk {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;


        if (isWeekend && !isRain) {
            canWalk = true;
            System.out.println("Я могу идти: " + canWalk);
        } else {
            canWalk = false;
            System.out.println("Я могу идти: " + canWalk);
        }

    }
}