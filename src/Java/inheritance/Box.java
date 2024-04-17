package Java.polymorphism.inheritance;

public class Box {
    double l;
    double h;
    double w;
    int number = 6;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
        System.out.println("Box Constructor");
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    protected void information() {
        System.out.print("Running the box");
    }
}

