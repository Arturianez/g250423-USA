package lesson2.task1;

public class Test {
    public static void main(String[] args) {

        Tiger bigTiger;
        bigTiger = new Tiger();
        bigTiger.weight = 150;

        Tiger smallTiger = new Tiger();
        smallTiger.weight = 100;
        System.out.println(bigTiger.weight);
        System.out.println(smallTiger.weight);
        System.out.println(Tiger.legsCount);
        bigTiger.sleep();
        smallTiger.sleep();
        System.out.println(10 % 3);
    }
}
