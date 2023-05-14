package lesson4.task1;

public class Cat {

    int age;
    String color;

    public Cat(){
        System.out.println("Вызван конструктор класса Cat");
    }
    public Cat(int age) {
        this.age = age;
        System.out.println("Вызван конструктор с возрастом");
    }
    public Cat(String color){
        this.color = color;
        System.out.println("Вызван конструктор с цветом");
    }
    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
        System.out.println("Вызван конструктор с двумя параметрами");
    }

}
