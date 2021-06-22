package Singleton;

public final class Singleton {
    // INSTANCE is the singleton object here. It is defined with private, static
    // and final keywords. Because, this object should not be accessible outside.
    // It should initialize at the class level and it should not be changed in future.
    private static final Singleton INSTANCE = new Singleton();

    // The constructor is private so that other classes cannot use them to create
    // an object of Singleton
    private Singleton() {

    }

    // the getInstance method is public so that other classes can call this method.
    // It is also static so that the calling classes doesn't require an object to
    // this method
    public static Singleton getInstance(){
        return INSTANCE;
    }

    public void sayHello(){
        System.out.println("Hello From Singleton");
    }

}
