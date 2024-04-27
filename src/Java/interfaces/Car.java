package Java.interfaces;

public class Car implements Brake, Engine {
    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate");
    }
}
