package homeworks.lesson5;

public class Stores {
    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean result = canBuy(isEdekaOpen,isReweOpen);


        if (result == true) {
            System.out.println("Я могу купить еду: " + result);
        } else {
            System.out.println("Я могу купить еду: " + result);
        }

    }
    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return  isEdekaOpen || isReweOpen;
        }
    }

