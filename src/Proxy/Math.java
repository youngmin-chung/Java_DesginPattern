package Proxy;

// The 'RealSubject' class
public class Math implements IMath {

    @Override
    public double Add(double x, double y) {
        return x + y;
    }

    @Override
    public double Subtract(double x, double y) {
        return x - y;
    }

    @Override
    public double Multiply(double x, double y) {
        return x * y;
    }

    @Override
    public double Divide(double x, double y) {
        return x / y;
    }
}
