package Proxy;

public class ProxyTester {
    public static void main(String[] args){
        // Create math proxy
        CalculateProxy proxy = new CalculateProxy();
        // Calculate something here
        System.out.println("Calculations");
        System.out.println("------------");
        System.out.println("\n10 + 5 = " + proxy.Add(10,5));
        System.out.println("\n10 - 5 = " + proxy.Subtract(10,5));
        System.out.println("\n10 * 5 = " + proxy.Multiply(10,5));
        System.out.println("\n10 / 5 = " + proxy.Divide(10,5));

    }
}
