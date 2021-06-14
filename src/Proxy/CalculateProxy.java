package Proxy;

// Proxy Object class
public class CalculateProxy implements IMath {
    private Math _math = new Math();

    @Override
    public double Add(double x, double y) {
        return _math.Add(x,y);
    }

    @Override
    public double Subtract(double x, double y) {
        return _math.Subtract(x,y);
    }

    @Override
    public double Multiply(double x, double y) {
        return _math.Multiply(x,y);
    }

    @Override
    public double Divide(double x, double y) {
        return _math.Divide(x,y);
    }
}
