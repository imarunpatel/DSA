package Java.polymorphism.inheritance;

class BoxWeight extends Box {
    double weight;
    int number = 7;
    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        this.weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        System.out.println("Box Weight Constructor");
        this.weight = weight;
    }
}