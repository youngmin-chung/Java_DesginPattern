package Singleton;

public class SingletonTester {
    public static void main(String[] args){
        Singleton instance = Singleton.getInstance();
        instance.sayHello();
    }
}
