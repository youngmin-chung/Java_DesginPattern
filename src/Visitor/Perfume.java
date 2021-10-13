package Visitor;

public class Perfume implements Visitable {

    private double price;

    Perfume(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
