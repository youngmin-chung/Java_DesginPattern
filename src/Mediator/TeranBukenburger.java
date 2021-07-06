package Mediator;

// Concrete Colleague class
public class TeranBukenburger extends Colleague{
    public TeranBukenburger(Mediator newMediator) {
        super(newMediator);

        System.out.println("Teran Bukenburger signed up with stock exchange\n");
    }
}
