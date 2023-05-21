package Lesson6.task1;

public class Main {
    public static void main(String[] args) {

        //инкремент, постфиксная и префиксная запись
        int value = 5;
        value = value + 1;
        value++; // увеличение на 1, постфиксная запись
        ++value; // тоже увеличение на 1, префиксная запись

        System.out.println("Значение переменной: "+ value);

        System.out.println(++value); // если value++, то в след soup будет +1


    }
}
