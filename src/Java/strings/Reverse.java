package Java.polymorphism.strings;


class Human {
    static String name = "Arun";
    int age;

}

public class Reverse extends Human {
    public static void main(String[] args) {
        Human obj = new Human();
        Human.name = "Patel";
        System.out.print(Human.name);
    }
}
