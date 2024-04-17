package Java.polymorphism.inheritance;

public class BoxPrice extends BoxWeight {

    double cost;
    int number = 9;
    BoxPrice() {
        super();
        this.cost = -1;
        System.out.println("Box price constructor" + l + " " + h);
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

}
