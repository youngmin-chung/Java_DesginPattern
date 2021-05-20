package Strategy;

/*
* When to use?
* When you want to define a class that will have one behavior
* that is similar to other behaviors in a list
*   - I want the class object to be able to choose from
*     - Not Flying
*     - Fly with Wings
*     - Fly super fast
* When you need to use on eof several behaviors dynamically...
*
* Often reduces long lists of conditionals
* Avoids duplicate code
* Keeps class changes from forcing other class changes
* Can hide complicated / secret code from the user
* Negative: Increased number of objects / classes
*
*/
public class StrategyTester {
    public static void main(String[] args){
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        // this allows dynamic changes for flyingType
        sparky.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + sparky.tryToFly() );
    }
}
