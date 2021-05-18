package Factory;

// Define a Factory method
public class FruitFactory {
    Fruit getFruit(String name){
        switch (name){
            case "apple":
                return new Apple();
            case "orange":
                return new Orange();
            case "banana":
                return new Banana();
        }
        throw new RuntimeException("No mathcing object could be created");
    }
}

/*
* To sum up, Factory pattern is used when the calling method doesn't know the
* type of object beforehand. And interfaces are the key to using different classes
* with similar implementation at runtime.
*
* */