package lesson4.task1;

public class CatTest {
    public static void main(String[] args) {

        System.out.println("Перед созданием кота");
        Cat firstCat = new Cat();
        System.out.println("После создания кота");

        System.out.println("Создаём второго кота");
        Cat secondCat = new Cat(7);

        System.out.println("Возраст первого кота");
        System.out.println(firstCat.age);

        System.out.println("Возраст второго кота");
        System.out.println(secondCat.age);

        System.out.println("Создаём третьего кота");
        Cat thirdCat = new Cat("Черный");

        System.out.println("Цвет черного кота");
        System.out.println(thirdCat.color);

        System.out.println("Создаём 4го кота");
        Cat forthCat = new Cat(3,"Рыжий");

        System.out.println("Возраст четвёртого кота");
        System.out.println(forthCat.age);
        System.out.println("Цвет черного кота");
        System.out.println(forthCat.color);

    }
}
