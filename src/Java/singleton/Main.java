package Java.polymorphism.singleton;

public class Main {

    public static void main(String[] arg) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variable are pointing to just one object
    }


}
