package Java.abstractDemo;

public class Son extends Parent{

    Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}
