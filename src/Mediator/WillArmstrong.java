package Mediator;

// Concrete Colleague class
public class WillArmstrong extends Colleague{
    public WillArmstrong(Mediator newMediator) {
        super(newMediator);

        System.out.println("Will Armstrong signed up with the stock exchange\n");
    }
}
