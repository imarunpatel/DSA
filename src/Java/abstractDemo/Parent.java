package Java.abstractDemo;

public abstract class Parent {

    int age;

    Parent(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("Hello");
    }

    abstract void career();
    abstract  void partner();
}
